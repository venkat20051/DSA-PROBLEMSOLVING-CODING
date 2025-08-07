class Solution {
    public int minDifference(String[] arr) {
        // code here
        Arrays.sort(arr);
        int dif=Integer.MAX_VALUE;
        // System.out.print(Arrays.toString(arr));
        int prevhour=Integer.parseInt(arr[0].charAt(0)+""+arr[0].charAt(1))*3600;
            int prevmin=Integer.parseInt(arr[0].charAt(3)+""+arr[0].charAt(4))*60;
            int prevsec=Integer.parseInt(arr[0].charAt(6)+""+arr[0].charAt(7));
            int prevTotal=prevhour+prevmin+prevsec;
            int firstTotal=prevTotal;
            int curTotal=0;
        for(int i=1;i<arr.length;i++)
        {
            
            
            int curhour=Integer.parseInt(arr[i].charAt(0)+""+arr[i].charAt(1))*3600;
            int curmin=Integer.parseInt(arr[i].charAt(3)+""+arr[i].charAt(4))*60;
            int cursec=Integer.parseInt(arr[i].charAt(6)+""+arr[i].charAt(7));
            curTotal=curhour+curmin+cursec;
            
            dif=Math.min(dif,Math.abs(curTotal-prevTotal));
            
            prevTotal=curTotal;
            
        }
        int fullDay = 24 * 3600;
        int circularDiff = fullDay - curTotal + firstTotal;
        dif = Math.min(dif,circularDiff);
        return dif;
    }
}

