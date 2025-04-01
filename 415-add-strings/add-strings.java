class Solution {
    public String addStrings(String num1, String num2) {
        int len1=num1.length()-1;
        int len2=num2.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder("");
        while(len1>=0 && len2>=0)
        {
            int first=num1.charAt(len1)-'0';
            int second=num2.charAt(len2)-'0';
            int sum=first+second+carry;
            int quo=sum%10;
            carry=sum/10;
            // System.out.println(first+" "+second+" "+sum+" "+quo+" "+carry);
            String st=Integer.toString(quo);
            str.insert(0,st);
            len1--;
            len2--;
        }
        while(len1>=0)
        {
            int first=num1.charAt(len1)-'0';
            int sum=first+carry;
            int quo=sum%10;
            carry=sum/10;
            // System.out.println(first+" "+second+" "+sum+" "+quo+" "+carry);
            String st=Integer.toString(quo);
            str.insert(0,st);
            len1--;
        }
        while(len2>=0)
        {
         int second=num2.charAt(len2)-'0';
            int sum=second+carry;
            int quo=sum%10;
            carry=sum/10;
            // System.out.println(first+" "+second+" "+sum+" "+quo+" "+carry);
            String st=Integer.toString(quo);
            str.insert(0,st);
            // len1--;
            len2--;   
        }
        if(carry!=0)
        {
            String st=Integer.toString(carry);
            str.insert(0,st);           
        }
        return str.toString();
    }

}