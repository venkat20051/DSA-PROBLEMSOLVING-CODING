class FindSumPairs {
    int[] first;
    int[] second;
    HashMap<Integer,Integer> setHashMap1=new HashMap<>();
    HashMap<Integer,Integer> setHashMap2=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        first=new int[nums1.length];
        second=new int[nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            first[i]=nums1[i];
            setHashMap1.put(nums1[i],setHashMap1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++)
        {
            second[i]=nums2[i];
            setHashMap2.put(nums2[i],setHashMap2.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        // System.out.println(Arrays.toString(second));
       int curr=second[index];
       second[index]+=val;
       int fre=setHashMap2.get(curr);
       if(fre==1)
       setHashMap2.remove(curr);
       else
       setHashMap2.put(curr,fre-1);
       setHashMap2.put(curr+val,setHashMap2.getOrDefault(curr+val,0)+1);
    }
    
    public int count(int tot) {
        int eachCount=0;
        for(int i=0;i<first.length;i++)
        {
            int rem=tot-first[i];
            if(setHashMap2.get(rem)!=null)
            eachCount+=setHashMap2.get(rem);
        }
        return eachCount;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */