class Solution {
    public int countOdds(int low, int high) {
        int dif=high-low+1;
        if(low%2!=0 && dif%2!=0) return (dif/2)+1;
        else return dif/2;
    }
}