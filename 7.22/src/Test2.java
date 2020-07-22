import java.util.Scanner;

/**
 * program:方法
 * description:
 * author: 陈一坤
 * date:
 **/
public class Test2 {
    //public static
    public static void main(String[] args) {

    }

    //递归求1+。。。+10
    public static int addNum2(int x){
        int num = 0;
        if (x == 1) {
            return 1;
        }else return num=num+x+addNum2 (x-1);
    }
    public static void main6(String[] args) {
        System.out.println (addNum2 (10) );
    }
    //打印数字每一位
    public static void print(int x){
        if (x > 9){
            print (x/10);
        }
        System.out.print (x%10+" ");
    }
    public static void main5(String[] args) {
        print (123);
    }
    //返回数字之和
    public static int addNum(int x){
        if (x <10) {
            return x;
        }
        return x%10+addNum (x/10);
    }
    public static void main4(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int n = scanner.nextInt ();
        System.out.println (addNum (n));
    }
    //斐波那契（递归
    public static int fibn(int x){
        if (x == 1||x==2) {
            return 1;
        }else return fibn (x-1)+fibn (x-2);
    }
    public static void main3(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int n = scanner.nextInt ();
        System.out.println (fibn (n));
    }
    //比较大小数字类型的重载
    public static int maxNum(int x,int y){
        return x>y?x:y;
    }
    public static double maxNum(double x,double y){
        return x>y?x:y;
    }
    public static double maxNum(double x,double y,int z){
        return maxNum (x,y)>z?maxNum (x,y):z;
    }
    public static void main2(String[] args) {
        double x =0.5;
        double y =1.5;
        int z =1;
        System.out.println (maxNum (x , y , z));
    }
    //加法重载
    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double x,double y,double o) {
        return x+y;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x= scanner.nextInt ();
        int y= scanner.nextInt ();
        double m=scanner.nextDouble ();
        double n=scanner.nextDouble ();
        double o=scanner.nextDouble ();
        System.out.println (add (x , y));
        System.out.println (add (m , n,o));
    }
}
