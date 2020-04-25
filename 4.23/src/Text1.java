import org.w3c.dom.*;

import javax.xml.soap.Node;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text1 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        LinkList linkList1 = new LinkList();
        LinkList linkList2 = new LinkList();


        linkList.addFirst(1);
        linkList.addFirst(2);
        linkList.addFirst(3);;
        linkList.display();
        System.out.println("---------------------");
        linkList1.addLast(5);
        linkList1.addLast(6);
        linkList1.addLast(7);
        linkList1.display();
        System.out.println("---------------------");
        linkList2.addLast(8);
        linkList2.addLast(9);
        linkList2.addLast(10);
        System.out.println(linkList2.contains(11));
        System.out.println("---------------------");
        System.out.println(linkList2.size());
        linkList.addIndex(2,2);
        linkList.display();
    }
    }