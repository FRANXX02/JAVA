/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Node{
    private int data;
    private Node next;
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class MyLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    public void addFirst(int data){
        Node node=new Node (data);
        node.setData (data);
        if (this.head == null) {
            this.setHead (node.getNext ());
            return;
        }
        if (this.head != null) {
            node.setNext (this.head.getNext ());
            this.head.setNext (node.getNext ());
        }
    }
    public void display(){
        Node cur =this.head;
        while (cur.getNext ()!=null){
            System.out.print (cur.getData ()+" ");
            cur=cur.getNext ();
        }

    }
}
