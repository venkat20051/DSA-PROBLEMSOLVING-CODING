class Solution {
    public int findMinIndex(int[] arr) {
        // code here
        int i;
        for(i=1;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1])
            return i;
        }
        if(arr[0]>arr[1])
        return arr.length-1;
        else
        return 0;
    }
}
