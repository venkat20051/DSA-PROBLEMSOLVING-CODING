class Solution {
    public int minRemoval(int[] nums, int k) {    //:)
        Arrays.sort(nums);
        int n = nums.length;
        int removals = n;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && (long)nums[j] <= (long)nums[i] * k) {
                j++;
            }
            removals = Math.min(removals,n-(j-i));
        }
        return removals;
    }
}
