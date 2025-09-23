class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> sample=new Stack<>();
        while(!q.isEmpty())
        sample.push(q.poll());
        while(!sample.isEmpty())
        q.add(sample.pop());
        
    }
}