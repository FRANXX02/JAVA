/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Demo {
    public static void main(String[] args) {
        LineList lineList = new LineList();
        lineList.addFirst(1);
        lineList.addFirst(2);
        lineList.addFirst(3);
        lineList.addFirst(4);
        lineList.addFirst(5);
        lineList.addLast(6);
        lineList.addLast(7);
        lineList.addLast(8);
        lineList.addLast(9);
        lineList.display();
        System.out.println(lineList.size());
        System.out.println(lineList.contains(5));
        lineList.addIndex(3,5);
        lineList.display();
        lineList.remove(9);
        lineList.display();

    }
}
