class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=height.length;
        for(int i=1;i<n;i++)
        {
            if(height[i-1]>threshold)
            ans.add(i);
        }
        return ans;
    }
}