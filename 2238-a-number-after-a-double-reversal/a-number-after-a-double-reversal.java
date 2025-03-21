class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num<=9)
        return true;
        int re=num%10;
        if(re==0)
        return false;
        return true;
    }
}