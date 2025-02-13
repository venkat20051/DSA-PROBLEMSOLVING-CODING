class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> res=new PriorityQueue<>();
        for(int i:nums)
        {
            res.add((long)i);
        }
        int operations=0;
        while(res.peek()<k)
        {
            Long one=res.poll();
            Long two=res.poll();
            Long latest=(one*2+two);
            res.add(latest);
            // System.out.println(res);
            operations++;
        }
        return operations;
    }
}