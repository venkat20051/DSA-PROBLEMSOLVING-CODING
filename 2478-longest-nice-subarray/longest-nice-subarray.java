class Solution {
    public static boolean check(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=2)
            {
                return false;
            }
        }
        return true;
    }
    public int longestNiceSubarray(int[] nums) {
        int[] bits=new int[32];
        Arrays.fill(bits,0);
        // System.out.println(Arrays.toString(bits));
        int max=0;
        int low=0;
        int high=0;
        int conflict=0;
        while(low<nums.length && high<nums.length)
        {
            // System.out.println(Arrays.toString(bits)+" "+max);
            int c=0;
            int temp=nums[high];
            while(temp!=0)
            {
                if((temp&1)>0)
                {
                bits[c]++;
                if(bits[c]>1)
                conflict++;
                }
                temp=temp>>1;
                c++;
            }
            while(conflict>0 && low<high)
            {
                int temp2=nums[low];
                int c1=0;
                while(temp2>0)
                {
                    if((temp2&1)>0)
                    {
                        bits[c1]--;
                        if(bits[c1]==1)
                        conflict--;
                    }
                    c1++;
                    temp2=temp2>>1;
                }
                low++;
            }
            max = Math.max(max, high - low+1);
            high++;
            // if(check(bits))
            // {
            //     high++;
            //     max=Math.max(max,Math.abs(low-high));
            // }
            // else
            // {
            //     while(!check(bits) && low<=high)
            //     {       
            //     int temp2 = nums[low];
            //     int c1 = 0;
            //     while (temp2 != 0) 
            //     {
            //         if ((temp2 & 1) > 0) {
            //             bits[c1]--;
            //         }
            //         temp2 >>= 1;
            //         c1++;
            //     }
            //     low++;
            //     }
            //     max = Math.max(max, high - low);
            //     if (low == high)
            //         high++;
            // }

        }
        max=Math.max(max,high-low);
        return max;
    }
}