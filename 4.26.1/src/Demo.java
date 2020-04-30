/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Demo {
    public static void main(String[] args) {
        MyList myList =new MyList();
        int[] arr = new int[]{1,2,3,4,5};
        myList.setElem(arr);
        myList.setUsedsize(arr.length);
        myList.add(3,5);
        myList.display();
        System.out.println(myList.contains(5));
        System.out.println(myList.search(2));
        myList.remove(4);
        myList.setPos(0,6);
    }
}
