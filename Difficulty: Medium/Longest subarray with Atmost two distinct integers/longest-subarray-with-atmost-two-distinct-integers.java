class Solution {
    public int totalElements(int[] arr) {
        // code here
        HashMap<Integer,Integer> sample=new HashMap<>();
        int st=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            sample.put(arr[i],sample.getOrDefault(arr[i],0)+1);
            while(sample.size()>2)
            {
                // System.out.println("hii");
                int x=arr[st];
                int count=sample.get(x);
                if(count==1)
                sample.remove(x);
                else
                sample.put(x,count-1);
                st++;
            }
            // System.out.println(sample);
            max=Math.max(max,(i-st+1));
        }
        return max;
    }
}