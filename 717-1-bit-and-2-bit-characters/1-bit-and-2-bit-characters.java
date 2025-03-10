class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        boolean a=false;
        int i=0;
        while(i<bits.length)
        {
            if(bits[i]==0)
            {
                a=true;
                i++;
            }
            else{
                a=false;
                i+=2;
            }
        }
        return a;
    }
}