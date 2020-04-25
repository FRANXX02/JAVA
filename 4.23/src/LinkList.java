import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.lang.invoke.WrongMethodTypeException;

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
public class LinkList {
    private Node head;// 单链表 头属性

    //打印
    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.getData()+ " ");
            cur = cur.getNext();
        }
    }
    //删除第一次出现的关键字为key节点
    public void remove(int key){

    }
    //删除所有值为 key 的节点
    public void removeAllKey(int key) {
    }
    //清空列表
    public void clear() {
        this.head = null;
    }

        //在任意位置插入，数据节点为0号下标
    public void addIndex(int index,int data){
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addLast(data);
            return;
        }
        Node node =new Node(data);
        Node cur = searchIndex(index);
        node.setNext(searchIndex(index).getNext());
        searchIndex(index).setNext(node);
        //node.setNext(searchIndex(index).getNext());
        //searchIndex(index).setNext(node);
    }
    private Node searchIndex(int index) {
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("插入位置不合法");
        }
        Node cur = this.head;
        while (index-1 != 0) {
            cur = cur.getNext();
            index--;
        }
        return cur;
    }
    //单链表长度
    public int size() {
        int count = 0;
        Node cur = this.head;
            while (cur != null) {
                cur = cur.getNext();
                count++;
            }
            return count;
    }
    // 查找是否包含关键字key是否在单链表中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur!=null){
            if (cur.getData() == key) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head== null) {
            this.head = node;
            return;
        }while (cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(node);
    }
    //头插法
    public void addFirst(int data) {

        Node node = new Node(data);
        //第一次插入节点
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.setNext(this.head);
        this.head = node;
    }
}
