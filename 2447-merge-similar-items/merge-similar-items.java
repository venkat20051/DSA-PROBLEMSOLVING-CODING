class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Arrays.sort(items1,(a,b)->Integer.compare(a[0],b[0]));
        // System.out.println(Arrays.deepToString(items1));
        Arrays.sort(items2,(a,b)->Integer.compare(a[0],b[0]));
        // System.out.println(Arrays.deepToString(items2));
        List<List<Integer>> res=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<items1.length && j<items2.length)
        {
            ArrayList<Integer> ans=new ArrayList<>();
            if(items1[i][0]==items2[j][0])
            {
                int first=items1[i][1]+items2[j][1];
                ans.add(items1[i][0]);
                ans.add(first);
                i++;j++;
            }
            else if(items1[i][0]<items2[j][0])
            {
                ans.add(items1[i][0]);
                ans.add(items1[i][1]);
                i++;
            }
            else
            {
                ans.add(items2[j][0]);
                ans.add(items2[j][1]);
                j++;
            }
            res.add(ans);
        }
        while(i<items1.length)
        {
            ArrayList<Integer> ans=new ArrayList<>();
             ans.add(items1[i][0]);
                ans.add(items1[i][1]);
                i++;
                res.add(ans);
        }
        while(j<items2.length)
        {
            ArrayList<Integer> ans=new ArrayList<>();
             ans.add(items2[j][0]);
                ans.add(items2[j][1]);
                j++;
                res.add(ans);
        }
        return res;
    }
}