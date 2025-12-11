// class Solution {
//     public int countCoveredBuildings(int n, int[][] buildings) {
//         HashMap<Integer,ArrayList<ArrayList<Integer>>> row=new HashMap<>();
//         HashMap<Integer,ArrayList<ArrayList<Integer>>> col=new HashMap<>();
//         int count=0;
//         for(int i=0;i<buildings.length;i++)
//         {
//             int r1=buildings[i][0];
//             int c1=buildings[i][1];

//             if(row.containsKey(r1))
//             {
//                 ArrayList<ArrayList<Integer>> sample=row.get(r1);
//                 ArrayList<Integer> sam=new ArrayList<>();
//                 sam.add(r1);
//                 sam.add(c1);
//                 sample.add(sam);
//                 row.put(r1,sample);
//             }
//             else
//             {
//                 ArrayList<ArrayList<Integer>> sample=new ArrayList<>();
//                 ArrayList<Integer> sam=new ArrayList<>();
//                 sam.add(r1);
//                 sam.add(c1);
//                  sample.add(sam);
//                 row.put(r1,sample);
//             }

//             if(col.containsKey(c1))
//             {
//                 ArrayList<ArrayList<Integer>> sample=col.get(c1);
//                 ArrayList<Integer> sam=new ArrayList<>();
//                 sam.add(r1);
//                 sam.add(c1);
//                  sample.add(sam);
//                 col.put(c1,sample);
//             }
//             else
//             {
//                 ArrayList<ArrayList<Integer>> sample=new ArrayList<>();
//                 ArrayList<Integer> sam=new ArrayList<>();
//                 sam.add(r1);
//                 sam.add(c1);
//                  sample.add(sam);
//                 col.put(c1,sample);
//             }
//         }
//         // System.out.println(row);
//         // System.out.println(col);
//         for(int i=0;i<buildings.length;i++)
//         {
//             int currow=buildings[i][0];
//             int curcol=buildings[i][1];
//             int left=0,right=0,top=0,down=0;

//             if(row.containsKey(currow))
//             {
//                 ArrayList<ArrayList<Integer>> sample=row.get(currow);
//                 for(int j=0;j<sample.size();j++)
//                 {
//                     int col1=sample.get(j).get(1);
//                     if(col1<curcol)left++;
//                     if(col1>curcol)right++;
//                 }
//             }
//              if(col.containsKey(curcol))
//             {
//                 ArrayList<ArrayList<Integer>> sample=col.get(curcol);
//                 for(int j=0;j<sample.size();j++)
//                 {
//                     int row1=sample.get(j).get(0);
//                     if(row1<currow)top++;
//                     if(row1>currow)down++;
//                 }
//             }
//             // System.out.println(left+" "+right+" "+top+" "+down+" "+currow+"::"+curcol);
//             if(left>0 && right>0 && top>0 && down>0)
//             count++;
//         }
//         return count;
//     }
// }

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {

        // Store min and max col for each row
        HashMap<Integer, Integer> minCol = new HashMap<>();
        HashMap<Integer, Integer> maxCol = new HashMap<>();

        // Store min and max row for each column
        HashMap<Integer, Integer> minRow = new HashMap<>();
        HashMap<Integer, Integer> maxRow = new HashMap<>();

        // Build info
        for (int[] b : buildings) {
            int r = b[0], c = b[1];

            minCol.put(r, Math.min(minCol.getOrDefault(r, c), c));
            maxCol.put(r, Math.max(maxCol.getOrDefault(r, c), c));

            minRow.put(c, Math.min(minRow.getOrDefault(c, r), r));
            maxRow.put(c, Math.max(maxRow.getOrDefault(c, r), r));
        }

        int count = 0;

        // Check coverage
        for (int[] b : buildings) {
            int r = b[0], c = b[1];

            boolean left  = minCol.get(r) < c;
            boolean right = maxCol.get(r) > c;

            boolean top   = minRow.get(c) < r;
            boolean down  = maxRow.get(c) > r;

            if (left && right && top && down)
                count++;
        }

        return count;
    }
}
