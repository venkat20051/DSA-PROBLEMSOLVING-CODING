class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a->a[0]));
        int i=0;
        int n=points.length;
        // ArrayList<int[]> sample=new ArrayList<>();
        int count=0;
        while(i<n)
        {
            int start=points[i][0];
            int end=points[i][1];
            int st=i+1;
            while(st<n)
            {
                if(end>=points[st][0])
                {
                    end=Math.min(end,points[st][1]);
                    start=Math.min(st,points[st][0]);
                }
                else
                {
                    break;
                }
                st++;
            }
            // int[] each=new int[2];
            // each[0]=start;
            // each[1]=end;
            // sample.add(each);
            count++;
            i=st;

        }
        return count;
    }
}