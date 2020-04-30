import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Node{
    private int data;
    private Node next;
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
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LineList {
    private Node head;//有head这个node型成员（未定义初始值
    //链表长度
    public int size(){
        Node cur = this.head;
        int size = 0;
        while(cur != null){
            size++;
            cur = cur.getNext();
        }
        return size;
    }
    //打印
    public void display() {
        Node cur = this.head;
        while (cur != null){
            System.out.print(cur.getData()+" ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.setNext(head);
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
            return;
        }
        while (cur.getNext()!= null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    //判断是否包含元素
    public boolean contains(int key){
        Node cur = this.head;
            while (cur != null){
                if (cur.getData() == key) {
                    return true;
                }
                cur = cur.getNext();
            }
            return false;
    }
    //查找index的前一个位置
    private Node searchIndex(int index){
        Node cur = this.head;
        if (index < 0||index > this.size()) {
            throw new RuntimeException("index异常");
        }while (index-1 != 0){
            cur = cur.getNext();
            index--;
        }
        return cur;
    }
    //任意位置插入，第一个数据节点为0号下标
    public void addIndex(int index,int data){
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
        }
        if (index == size()) {
            addLast(data);
        }
        Node cur = searchIndex(index);
        node.setNext(cur.getNext());
        cur.setNext(node);
    }
    //删除key的节点
    public void remove(int key){
        if (this.head == null) {
            return;
        }
        if (this.head.getData() == key) {
            this.head = this.head.getNext();
            return;
        }
        Node cur = searchIndex(key);
        if (cur == null) {
            System.out.println("没有这个节点");
            return;
        }
        Node del = cur.getNext();
        cur.setNext(del.getNext());
    }

}

