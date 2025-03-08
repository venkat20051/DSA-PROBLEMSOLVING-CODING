class Solution {
    public int minimumRecolors(String blocks, int k) {
        StringBuilder sam=new StringBuilder();
        int black=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='B')
            black++;
            sam.append(blocks.charAt(i));
        }
        int j=k;
        int white=k-black;
        int min=white;
        if(min==0)
        return 0;
        // System.out.println(k+"-"+black+"="+(k-black));
        // return black;
        while(j<blocks.length())
        {
            if(blocks.charAt(j-k)=='W')
            white--;
            if(blocks.charAt(j)=='W')
            white++;
            sam.deleteCharAt(0);
            sam.append(blocks.charAt(j));
            min=Math.min(white,min);
            if(min==0)
            return 0;
            j++;
        }
        min=Math.min(min,white);
        return min;

    }
}