import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Test2 {
    public static void main(String[] args) {
        MyArraylist myArraylist=new MyArraylist();
        myArraylist.add (0,1);
        myArraylist.add (1,2);
        myArraylist.add (2,3);
        myArraylist.add (3,4);
        myArraylist.display ();
        System.out.println ("=======================");
        System.out.println (myArraylist.contains (3));
        System.out.println ("=======================");
        System.out.println (myArraylist.search (4));
        System.out.println ("=======================");
        System.out.println (myArraylist.getPos (1));
        System.out.println ("=======================");
        System.out.println (myArraylist.size ( ));
        System.out.println ("=======================");
        myArraylist.remove (3);
        myArraylist.display ();

    }
}
