class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        ArrayList<Integer> sample=new ArrayList<>();
        ArrayList<Integer> first=new ArrayList<>();
        ArrayList<Integer> second=new ArrayList<>();
        ArrayList<Integer> third=new ArrayList<>();

        for(int i:nums1)
        {
            first.add(i);
        } 
        for(int i:nums2)
        {
            second.add(i);
        } 
        for(int i:nums3)
        {
            third.add(i);
        } 
        for(int i=0;i<first.size();i++)
        {
            int x=first.get(i);
            if((second.contains(x) || third.contains(x))&& !sample.contains(x))
            {
                sample.add(x);
            }
        }
         for(int i=0;i<second.size();i++)
        {
            int x=second.get(i);
            if((first.contains(x) || third.contains(x))&& !sample.contains(x))
            {
                sample.add(x);
            }
        }
        return sample;
    }
}