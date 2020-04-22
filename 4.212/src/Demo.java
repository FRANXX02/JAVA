import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Demo {
    public static void main(String[] args) {
        List list = new List();
        List list1 = new List();
        int[] arr = new int[]{3, 5, 7, 1, 6, 9};
        //插入数字并且打印
        list.setElem(arr);//设置数组
        list.setUsedSize(arr.length);//有效数据个数
        list1.setElem(arr);//设置数组
        list1.setUsedSize(arr.length);
        //System.out.println(list.getUsedSize());
        //System.out.println(Arrays.toString(list.getElem()));
        list.add(3, 5);
        //list.display();
        System.out.println(list.search(7));
        System.out.println(list.contains(9));
        System.out.println(list.getPos(5));
        list.remove(7);
        //list.display();
        list.setPos(2,4);
        list1.setPos(3,5);
        //list.display();
    }
}
