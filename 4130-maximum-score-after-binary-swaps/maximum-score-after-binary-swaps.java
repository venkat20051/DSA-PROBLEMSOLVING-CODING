class Solution {
    public long maximumScore(int[] nums, String s) {
        long sum=0;
        PriorityQueue<Integer> ans=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<s.length();i++)
        {
            ans.add(nums[i]);
            if(s.charAt(i)=='1')
            sum+=ans.poll();
        }
        return sum;
    }
}