import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text2 {
    //三个数的最大值（重载）
    public static int max2(double x, double y, int z){
        return (max2((int)max2(x, y), z));
    }
    public static double max2(double x, double y){
        return x > y ? x : y;
    }
    public static int max2(int x, int y){
        return x > y ? x : y;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(max2(x, y, z));
    }
    //阶乘和
    public static int jc(int y) {
        if (y == 1) {
            return 1;
        } else {
            return  y * jc(y - 1);
        }
    }
    public static int su(int x) {
        int ret = 0;
        for (int i = 1; i <= x; i++) {
            ret += jc(i);
        }
        return ret;
    }

    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(su(n));
    }



    //求斐波那契数列的第n项（递归）
    public static int fib(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else{
            return  a = fib(a - 1) + fib(a - 2);
    }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fib(x));
    }


    //数组元素之和
    public static int sum(int[]x){
        int ret = 0;
        for (int y:x) {
            ret += y;
        }
        return ret;
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ret = sum(arr);
        System.out.println(ret);
    }
}
