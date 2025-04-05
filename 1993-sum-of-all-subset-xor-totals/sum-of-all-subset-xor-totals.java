class Solution {
    public static int res(int i,int[] arr,ArrayList<Integer> cur)
    {
        if(i==arr.length)
        {
            return Calucluate(cur);
        }
        else
        {
            cur.add(arr[i]);
            int ind=res(i+1,arr,cur);
            cur.remove(cur.size()-1);
            int ext=res(i+1,arr,cur);
            return ind+ext;
        }
    }
    public static int Calucluate(ArrayList<Integer> s)
    {
        int c=0;
        for(Integer num:s)
        {
            c=c^num;
        }
        return c;
    }
    public int subsetXORSum(int[] nums) {
        int c=0;
        ArrayList<Integer> str=new ArrayList<>();
        return res(0,nums,str);
    }
}