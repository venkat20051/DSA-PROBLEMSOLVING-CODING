class Solution {
    public int totalFruit(int[] fruits) {
        int start=0;
        HashMap<Integer,Integer> sam1=new HashMap<>();
        // HashMap<Integer,Integer> sam2=new HashMap<>();
        int n=fruits.length;
        int maximum=Integer.MIN_VALUE;
        int count=0;
        // int a=-1,b=-1;
        for(int i=0;i<n;i++)
        {
                sam1.put(fruits[i],sam1.getOrDefault(fruits[i],0)+1);
                count++;
                while(sam1.size()>2)
                {
                    
                    int pre=fruits[start];
                    int val=sam1.get(pre);
                    if(val==1)
                    {
                        sam1.remove(pre);
                        count--;
                    }
                    else{
                        sam1.put(pre,val-1);
                        count--;
                    }
                    maximum=Math.max(maximum,count);
                    start++;
                }
                
                maximum=Math.max(maximum,count);
            
        }
         maximum=Math.max(maximum,count);

        return maximum;
    }
}