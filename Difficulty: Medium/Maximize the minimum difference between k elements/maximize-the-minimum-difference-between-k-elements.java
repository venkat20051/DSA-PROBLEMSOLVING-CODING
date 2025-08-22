class Solution {
    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=0;
        int high=arr[arr.length-1]-arr[0];
        int res=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(fun(arr,mid,k))
            {
                low=mid+1;
                res=mid;
            }
            else
            {
                high=mid-1;
            }
            
        }
        return res;
    }
    public static boolean fun(int[] arr,int tar,int k)
    {
        int count=1;
        int ele=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if((arr[i]-ele)>=tar)
            {
            count++;
            ele=arr[i];
            }
        }
        if(count>=k)
        return true;
        else
        return false;
        
    }
}
