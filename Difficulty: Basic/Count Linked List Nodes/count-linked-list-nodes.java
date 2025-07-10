/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int n=0;
        while(head!=null)
        {
            head=head.next;
            n++;
        }
        return n;
    }
}