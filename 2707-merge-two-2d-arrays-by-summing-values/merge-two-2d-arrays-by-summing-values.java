class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> sample=new TreeMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            int key=nums1[i][0];
            int value=nums1[i][1];
            sample.put(key,sample.getOrDefault(key,0)+value);
        }
        for(int i=0;i<nums2.length;i++)
        {
            int key=nums2[i][0];
            int value=nums2[i][1];
            sample.put(key,sample.getOrDefault(key,0)+value);
        }
        // System.out.println(sample);
        int[][] ans=new int[sample.size()][2];
        int k=0;
        for(Map.Entry<Integer,Integer> hm:sample.entrySet())
        {
            int key=hm.getKey();
            int val=hm.getValue();
            ans[k][0]=key;
            ans[k][1]=val;
            k++;
        }
        return ans;
    }
}