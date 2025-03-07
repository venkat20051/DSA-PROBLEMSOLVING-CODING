class Solution {
    public int maxPower(String s) {
        int max=1;
        int count=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {
                max=Math.max(max,count);
                // System.out.println(s.charAt(i)+"!="+s.charAt(i-1));
                count=1;
            }
            else
            {
            // System.out.println(s.charAt(i)+"=="+s.charAt(i-1));
                count++;
            }
        }
        max=Math.max(max,count);
        return max;
    }
}