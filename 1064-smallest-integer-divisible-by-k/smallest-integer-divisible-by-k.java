class Solution {
    public int smallestRepunitDivByK(int k) {
        long max=9223372036854775807L;
        long cur=1L;
        int digit=1;
        if(k%2==0|| k%5==0)return -1;
        while(cur%k!=0)
        {
            cur=(cur*10+1)%k;
            digit++;

        }
        return digit;
    }
}