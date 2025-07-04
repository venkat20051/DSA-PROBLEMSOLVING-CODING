class Solution {
    public ArrayList<Integer> divFloorCeil(int a, int b) {
        // code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        // int div=a/b;
        // int rem=a%b;
        // if(rem==0)
        // {
        //     ans.add(div);
        //     ans.add(div);
        // }
        // else if(div<0)
        // {
        //     ans.add(div-1);
        //     ans.add(div);
        // }
        // else
        // {
        //     ans.add(div);
        //     ans.add(div+1);
        // }
        int floo=(int)Math.floorDiv(a,b);
        int cei=(a%b==0)?floo:floo+1;
        ans.add(floo);
        ans.add(cei);
        return ans;
    }
}