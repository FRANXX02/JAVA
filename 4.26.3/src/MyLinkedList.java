import com.sun.xml.internal.bind.v2.schemagen.xmlschema.TypeHost;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;//头
    public Node tail;//尾巴
    //
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    //
    public void display(){
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        this.tail = node;
    }
    //
    public int size() {
        Node cur = this.head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
    //
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null){
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    //
    public void addIndex(int pos,int data){
        checkIndex(pos);
        Node node =new Node(data);
        if (pos == 0) {
            addFirst(data);
        }else if (pos == size()) {
            addLast(data);
        }else {
            Node cur = searchIndex(pos);
            node.next = cur;
            node.prev = node.prev;
            cur.prev.next = node;
            cur.prev = node;
        }
    }
    //
    public Node searchIndex(int index){
        Node cur = this.head;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
            index--;//
        }
        return cur;
    }
    //
    public void remove(int data){
        0000
    }
}
