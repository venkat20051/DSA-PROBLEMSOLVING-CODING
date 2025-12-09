// class Solution {
//     static final int MOD = 1000000007;
//     public int specialTriplets(int[] nums) {
//         HashMap<Integer,ArrayList<Integer>> sample=new HashMap<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             if(sample.containsKey(nums[i]))
//             {
//                 ArrayList<Integer> sam=sample.get(nums[i]);
//                 sam.add(i);
//                 sample.put(nums[i],sam);
//             }
//             else
//             {
//                 ArrayList<Integer> sam=new ArrayList<>();
//                 sam.add(i);
//                 sample.put(nums[i],sam);
//             }
//         }
//         int count=0;
//         for(Map.Entry<Integer,ArrayList<Integer>> hm:sample.entrySet())
//         {
//             int cur=hm.getKey();
//             ArrayList<Integer> sam=hm.getValue();
//             if(cur == 0) {
//                 if(sam.size() >= 3) {
//                     int n = sam.size();
//                     long ways = 1L * n * (n-1) % MOD * (n-2) % MOD;
//                     ways = ways * 166666668 % MOD; // modular inverse of 6
//                     count = (int)((count + ways) % MOD);
//                     continue;
//                     }
//             }
//             if(cur!=0 && sample.containsKey(cur*2))
//             {
//                 ArrayList<Integer>inner=sample.get(cur*2);
//                 for(int i=0;i<sam.size();i++)
//                 {
//                     int leftcount=0;
//                     int rightcount=0;
//                     for(int j=0;j<inner.size();j++)
//                     {
//                         if(inner.get(j)<sam.get(i))
//                         {
//                             leftcount++;
//                         }
//                         else
//                         {
//                             rightcount=(inner.size()-j);
//                             break;
//                         }
//                     }
//                     // System.out.println(leftcount+" "+rightcount+" "+cur+" "+cur*2);
//                    if(leftcount > 0 && rightcount > 0) {
//                     count = (int)((count + (1L * leftcount * rightcount) % MOD) % MOD);
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    static final int MOD = 1000000007;

    // binary search lower_bound
    private int lowerBound(ArrayList<Integer> arr, int x){
        int l = 0, r = arr.size();
        while(l < r){
            int m = (l + r) / 2;
            if(arr.get(m) < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    // binary search upper_bound
    private int upperBound(ArrayList<Integer> arr, int x){
        int l = 0, r = arr.size();
        while(l < r){
            int m = (l + r) / 2;
            if(arr.get(m) <= x) l = m + 1;
            else r = m;
        }
        return l;
    }

    public int specialTriplets(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> sample = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            sample.computeIfAbsent(nums[i], v -> new ArrayList<>()).add(i);
        }

        int count = 0;

        for(Map.Entry<Integer,ArrayList<Integer>> hm : sample.entrySet()){
            int cur = hm.getKey();
            ArrayList<Integer> sam = hm.getValue();

            // case 1: zero triplets
            if(cur == 0 && sam.size() >= 3){
                int n = sam.size();
                long ways = 1L * n * (n-1) % MOD * (n-2) % MOD;
                ways = ways * 166666668 % MOD; // inverse of 6
                count = (int)((count + ways) % MOD);
                continue;
            }

            // case 2: normal triplets
            if(cur != 0 && sample.containsKey(cur * 2)){
                ArrayList<Integer> inner = sample.get(cur * 2);

                for(int i = 0; i < sam.size(); i++){
                    int x = sam.get(i);

                    int leftcount = lowerBound(inner, x);
                    int rightcount = inner.size() - upperBound(inner, x);

                    if(leftcount > 0 && rightcount > 0){
                        count = (int)((count + 1L * leftcount * rightcount % MOD) % MOD);
                    }
                }
            }
        }

        return count;
    }
}
