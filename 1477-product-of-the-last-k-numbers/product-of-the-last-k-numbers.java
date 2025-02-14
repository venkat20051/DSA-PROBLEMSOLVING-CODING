class ProductOfNumbers {
    private ArrayList<Integer> res;
    public ProductOfNumbers() {
        res=new ArrayList<>();
    }
    
    public void add(int num) {
        res.add(num);
    }
    
    public int getProduct(int k) {
        int pro=1;
        for(int i=res.size()-1;i>=res.size()-k;i--)
        {
            pro*=res.get(i);
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */