import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;
/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/

public class Test1 {
    //求阶乘之和
    public static int fac(int n){
        int ret = 1;
        for(int i = 1;i <= n;i++){
            ret*=i;
        }
        return ret;
    }
    public static int fact(int n){
        int sum = 0;
        for(int i=1;i <= n;i++){
            sum+=fac(i);
        }
        return sum;
    }
    public static void main7(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fact(x));
    }
    //两个数相加
    public static int add(int a, int b){
        return a+b;
    }
    public static void main6(String[] args) {
        int a =1;
        int b = 2;
        System.out.println(add(a,b));

    }

    //求三个数的最大值
    public static int maxNum(int n1,int n2,int n3) {
        return maxNum(maxNum(n1, n2), n3);
    }

    public static void main5(String[] args) {
        Scanner scan =new Scanner(System.in);
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        System.out.println(maxNum(x1,x2,x3));
    }

    //比较两个数的最大值
    public static int maxNum(int n1,int n2){
        return n1 > n2 ? n1 : n2;
    }
    public static void main4(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int ret = 0;
        ret = maxNum(n1,n2);
        System.out.println(ret);
    }

    //打印二进制奇数位和偶数位
    public static void main3(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 31;i >= 1;i -= 2){//偶数位
            System.out.print((n >> i)& 1);
        }
        System.out.println();
        for(int i = 30;i >= 0;i -= 2){//奇数位
            System.out.print((n >> i)& 1);
        }
    }
    public static void main2(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }
    // 求二进制中1的个数q
    public static void main1(String[] args) {//psvm
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for (int i = 0;i < 32;i++){
            if(((n >> i) & 1) ==1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
