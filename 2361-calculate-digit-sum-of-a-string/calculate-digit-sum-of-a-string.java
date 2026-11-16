class Solution {
    public String digitSum(String s, int k) {
        StringBuilder str=new StringBuilder(s);
        while(str.length()>k)
        {
            StringBuilder sample=new StringBuilder("");
            int i=0;
            int n=str.length(); 
            int temp=0;
            int sum=0;
            while(i<n)
            {
                if(temp<k)
                {
                    sum+=(int)(str.charAt(i)-'0');
                    temp++;
                }
                if(temp==k)
                {
                    temp=0;
                    sample.append(""+sum);
                    // System.out.println("inside:"+sum);
                    sum=0;
                }
                i++;
                // System.out.println(sum);
            }
            if(temp!=0)
            {
                sample.append(""+sum);
                temp=0;
                sum=0;
            }
            str.setLength(0); // Clears sb2 without allocating a new object
            str.append(sample);
            // System.out.println(sample);
        }
        return str.toString();
    }
}