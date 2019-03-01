package linkedList;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private static int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
        head.next = null;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);

        myLinkedList.addFirst(9);
        myLinkedList.addFirst(8);
        myLinkedList.add(1, 50);
        myLinkedList.printList();
        System.out.println(myLinkedList.get(1).data);

    }
}
