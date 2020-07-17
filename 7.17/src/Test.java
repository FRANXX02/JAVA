/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int num1 = (a > b) ? a :b;
        int num2 = (num1 > c) ? num1 :c;
        System.out.println (num2 );
    }
}
