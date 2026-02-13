class MyHashSet {
    ArrayList<Integer> sample;
    public MyHashSet() {
        sample=new ArrayList<>();
    }
    
    public void add(int key) {
       if(!sample.contains(key))sample.add(key);
    }
    
    public void remove(int key) {
        sample.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(sample.contains(key))return true;
        else return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */