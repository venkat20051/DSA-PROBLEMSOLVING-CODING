class Solution {
    public String convertToBase7(int num) {
        int neg=0;
        if(num<0)
        {
            neg=1;
            num=num*(-1);
        }
        String ans=Integer.toString(num,7);
        if(neg==1)
        return '-'+ans;
        return ans;
    }
}