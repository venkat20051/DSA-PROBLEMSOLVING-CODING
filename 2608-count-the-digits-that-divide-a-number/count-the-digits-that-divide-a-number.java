class Solution {
    public int countDigits(int num) {
        int temp=num;
        int count=0;
        HashSet<Integer>sample=new HashSet<>();
        while(temp!=0)
        {
            int rem=temp%10;
            if(num%rem==0 && !sample.contains(sample))
            count++;
            sample.add(rem);
            temp=temp/10;
        }
        return count;
    }
}