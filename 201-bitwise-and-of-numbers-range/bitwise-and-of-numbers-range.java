class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       while(right>left)
       {
        right=right &(right-1);
        if(right==0)
        return 0;
       }
        return right;
    }
}