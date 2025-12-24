class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int count=0;
        Arrays.sort(capacity);
        for(int i=0;i<apple.length;i++)
        {
            count+=apple[i];
        }
        int j=capacity.length-1;
        int ans=0;
        while(count>0)
        {
            count-=capacity[j];
            j--;
            ans++;

        }
        return ans;
    }
}