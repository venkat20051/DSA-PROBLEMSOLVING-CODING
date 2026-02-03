class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n-1 && nums[i]<nums[i+1])
            {
                i++;
            }
        // System.out.println(i);
        if(i==0)
            return false;
        int j=i;
        while(j<n-1 && nums[j]>nums[j+1])
            {
                j++;
            }
        // System.out.println(i+" "+j);
        if(i==j)
            return false;
        int k=j;
        while(k<n-1 && nums[k]<nums[k+1])
            k++;
        // System.out.println(j+" "+k);
        if(k==j || k!=nums.length-1)
            return false;
        return true;
    }
}