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
}
public class MyLinkedList {
    private Node head;
    public void addFirst(int data){
        Node node=new Node (data);


    }
}
