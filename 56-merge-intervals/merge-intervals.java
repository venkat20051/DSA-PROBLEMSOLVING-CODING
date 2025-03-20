class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (n1, n2) -> Integer.compare(n1[0], n2[0]));
    int n=intervals.length;
    ArrayList<int[]>ans=new ArrayList<>();
    int i=0;
    while(i<n)
    {
        int st=intervals[i][0];
        int end=intervals[i][1];
        int staring=i+1;
        while(staring<n)
        {
            if(end>=intervals[staring][0])
            {
                st=Math.min(st,intervals[staring][0]);
                end=Math.max(end,intervals[staring][1]);
            }
            else
            {
                break;
            }
            staring++;
        }
        int[] each=new int[2];
        each[0]=st;
        each[1]=end;
        ans.add(each);
        i=staring;
    }
    return ans.toArray(new int[ans.size()][]);

    }
}