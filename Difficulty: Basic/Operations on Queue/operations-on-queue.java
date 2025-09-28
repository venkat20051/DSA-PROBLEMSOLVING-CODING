// User function Template for Java
class Solution {
    public void enqueue(Queue<Integer> q, int x) {
        // code here
        q.add(x);
    }

    public void dequeue(Queue<Integer> q) {
        
        // code here
        q.poll();
    }

        
    public int front(Queue<Integer> q) {
        // code here
        return  q.peek();
        
    }
        

    public boolean find(Queue<Integer> q, int x) {
        // code here
        return q.contains(x);
    }
}