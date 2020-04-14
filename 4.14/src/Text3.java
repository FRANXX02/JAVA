import java.util.Scanner;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text3 {
    public static void cdc(int x){
        if(x > 9){
            cdc(x / 10);
        }
        System.out.print(x % 10+" ");

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        cdc(x);
    }
    //递归求 1 + 2 + 3 + ... + 10
    public static int adc(int x){
        if(x == 1){
            return 1;
        }
        return x += adc(x-1);
    }
    public static void main4(String[] args) {
        int x = 10;
        System.out.println(adc(x));
    }
    //递归方法，输入一个非负整数，返回组成它的数字之和
    public static int ads(int x){
        if(x < 10){
            return x;
        }
        return ads(x/10) + (x%10);
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(ads(x));
    }

    //青蛙跳台阶
    public static int jump(int x){
        if (x == 1){
            return 1;
        }else if(x == 2){
            return 2;
        }else{
            return (x - 1) + (x - 2);
        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(jump(x));
    }
    //求两个整数的方法 和 三个小数之和
    public static double add(double x, double y, double z){
        return x + y + z;
    }
    public static int add(int x, int y){
        return x + y;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        System.out.println(add(x ,y,z));
    }
}
