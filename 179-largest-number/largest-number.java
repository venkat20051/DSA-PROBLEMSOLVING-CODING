class Solution {
    public String largestNumber(int[] nums) {
        TreeMap<Integer,ArrayList<Integer>> sample=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            String s=Integer.toString(nums[i]);
            int key=s.charAt(0)-'0';
            if(sample.containsKey(key))
            {
                ArrayList<Integer> each=sample.get(key);
                // String stp=Integer.toString(nums[i]);
                each.add(nums[i]);
                sample.put(key,each);
            }
            else
            {
                ArrayList<Integer> each=new ArrayList<>();
                // String stp=Integer.toString(nums[i]);
                each.add(nums[i]);
                sample.put(key,each);
            }
        }
        // System.out.println(sample);
        StringBuilder str=new StringBuilder();
        for(Map.Entry<Integer,ArrayList<Integer>>hm:sample.entrySet())
        {
            ArrayList<Integer> all=hm.getValue();
            // ArrayList<Integer> all = entry.getValue();
            // System.out.println("Before sorting: " + all);

            // Correct sorting using concatenation logic
            Collections.sort(all, (a, b) -> (b + "" + a).compareTo(a + "" + b));

            // System.out.println("After sorting: " + all);

            for(int i=0;i<all.size();i++)
            {
                String rcb=Integer.toString(all.get(i));
                str.append(rcb);
            }
        }
       while (str.length() > 1 && str.charAt(0) == '0') {
    str.deleteCharAt(0);
}
        return str.toString();
    }
}