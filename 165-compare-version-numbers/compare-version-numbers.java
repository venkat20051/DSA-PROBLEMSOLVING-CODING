class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1=version1.split("\\.");
        String[] arr2=version2.split("\\.");
        // System.out.println(Arrays.toString(arr1));
        ArrayList<Integer> first=new ArrayList<>();
        ArrayList<Integer> second=new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            int num=Integer.parseInt(arr1[i]);
            // if(num!=0)
            first.add(num);
        }
        for(int i=0;i<arr2.length;i++)
        {
            int num=Integer.parseInt(arr2[i]);
            // if(num!=0)
            second.add(num);
        }
        // System.out.println(first);
        // System.out.println(second);
        int i=0;
        int j=0;
        while(i<first.size() && j<second.size())
        {
            if(first.get(i)>second.get(i))
            return 1;
            else if(first.get(i)<second.get(i))
            return -1;
            i++;
            j++;
        }
        // System.out.println(i+" "+j);
       while(i<first.size())
       {
        if(first.get(i)!=0)
        return 1;
        i++;
       }
       while(j<second.size())
       {
        if(second.get(j)!=0)
        return -1;
        j++;
       }
        return 0;
    }
}