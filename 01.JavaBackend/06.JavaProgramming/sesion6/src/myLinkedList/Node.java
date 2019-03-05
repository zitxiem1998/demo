package myLinkedList;

public class Node {
    public Object data;
    public Node next;

    public Node(Object data) {
        this.data=data;
        this.next=null;
    }

    public Object getData() {
        return this.data;
    }
}
