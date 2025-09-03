class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            ans.add(arr[i]+ans.get(i-1));
        }
        return ans;
    }
}