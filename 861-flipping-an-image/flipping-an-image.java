class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            int start=0;
            int end=image[i].length-1;
            while(start<=end)
            {
                if(start!=end)
                {
                image[i][start]=(image[i][start]==0)?1:0;
                image[i][end]=(image[i][end]==0)?1:0;
                }
                else
                {
                image[i][start]=(image[i][start]==0)?1:0; 
                }
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;
                end--;
                start++;
            }
        }
        return image;
    }
}