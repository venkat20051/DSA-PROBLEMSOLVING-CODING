class Solution {
    public void rotateclockwise(int[] arr, int k) {
        // code here
        int rotation=k%arr.length;
        // System.out.println(rotation);
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=arr[(i+((n)-rotation))%n];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=ans[i];
        }
    }
}