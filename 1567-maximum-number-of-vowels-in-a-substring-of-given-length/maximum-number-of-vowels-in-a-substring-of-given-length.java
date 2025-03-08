class Solution {
    public int maxVowels(String s, int k) {
        StringBuilder sam=new StringBuilder();
        int vo=0;
        String voweles="aeiou";
        for(int i=0;i<k;i++)
        {
            if(voweles.contains(""+s.charAt(i)))
            vo++;
            sam.append(s.charAt(i));
        }
        int max=vo;
        int j=k;
        while(j<s.length())
        {
            // System.out.println(sam);
            if(voweles.contains(""+s.charAt(j-k)))
            vo--;
            if(voweles.contains(""+s.charAt(j)))
            vo++;
            sam.deleteCharAt(0);
            sam.append(s.charAt(j));
            max=Math.max(max,vo);
            j++;
        }
        // System.out.println(sam);
        max=Math.max(max,vo);
        return max;
    }
}