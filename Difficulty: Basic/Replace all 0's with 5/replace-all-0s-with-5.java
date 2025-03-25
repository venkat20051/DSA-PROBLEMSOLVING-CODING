//{ Driver Code Starts
import java.lang.Math;
import java.util.Scanner;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new Solution().convertfive(N));
            T--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    int convertfive(int num) {
        // Your code here
        if(num==0)
        return 5;
        int temp=num;
        int i=0;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            if(rem==0)
            rem=5;
            sum=sum+rem*(int)(Math.pow(10,i));
            i++;
            temp=temp/10;
        }
        return sum;
    }
}