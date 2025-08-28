class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double diagonal=0;
        int area=0;
        for(int i=0;i<dimensions.length;i++)
        {
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            double cur=Math.sqrt(l*l+w*w);
            if(cur>diagonal)
            {
                // System.out.println(cur+" "+diagonal);
                
                area=l*w;
                diagonal=Math.max(diagonal,cur);
            }
            if(cur==diagonal)
            {
                area=Math.max(area,l*w);
            }
        }
        return area;
    }
}