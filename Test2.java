import java.util.Scanner;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/


public class Test2 {
    // n的阶乘
    public static int jc(int x){
        if(x==1){
            return 1;
        return x*jc(x-1);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(jc(x));
    }
    //迭代实现斐波那契
    public static int fibc(int x){
        int a = 1;
        int b = 1;
        int c = 1;
        for(int i =3;i<=x;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main4(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fibc(x));

    }

    //斐波那契数列第n项
    public static int fib(int a){
        if(a==2||a==1){
            return 1;
        }
        return fib(a-1)+fib(a-2);
    }
    public static void main3(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fib(x));
    }

    //求正整数的每一位之和
    public static int xy(int x) {
        if (x < 10) {
            return x;
        }
        return x % 10 + xy(x / 10);
    }

    public static void main2(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(xy(x));
    }
    //累加到n
    public static int sum(int x){
        if(x==1) {
            return 1;
        }
        int add= 0;
        add = x + sum(x-1);
        return add;
    }
    public static void main1(String[] args) {
        System.out.println(sum(5));
    }
}
