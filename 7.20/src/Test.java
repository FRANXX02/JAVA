import java.util.Arrays;
import java.util.Scanner;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Test {
    //找出现一次的数字
    public static int findNum(int[] arr){
        int len =arr.length;
        int num = 0;
        Arrays.sort (arr);
        for (int i = 1; i < len-1; i++) {
            if (arr[i] != arr[i-1]&&arr[i] != arr[i+1]) {
                num = arr[i];
                break;
            }else if (arr[0]!=arr[1]){
                num= arr[0];
            }else{
                num = arr[len-1];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,5,};
        int ret= findNum (arr);
        System.out.println (ret );
    }
    //奇数在偶数左边
    public static void line(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            for (int j = length-1; j > 0 ; j--) {
                if (arr[j]%2==1&&arr[j-1]%2==0) {
                    int tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }
    public static void main5(String[] args) {
        int[] arr={4,3,5,8,7};
        line (arr);
        System.out.println (Arrays.toString (arr) );
    }
    public static int max3(int x,int y,int z){
        int num2 = 0;
        num2 = max2 (x,y);
        num2 = max2 (num2,z);
        return num2;
    }
    public static int max2(int x,int y){
        int num1= 0;
        num1 = x>y?x:y;
        return num1;
    }
    public static void main4(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt ();
        int y = scan.nextInt ();
        int z = scan.nextInt ();
        System.out.println (max3 (x,y,z) );
    }

//        public static int maxNum(int x,int y,int z){
//        int num = 0;
//        num = x>y?x:y;
//        num = num>z?num:z;
//        return num;
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//        int x = scan.nextInt ();
//        int y = scan.nextInt ();
//        int z = scan.nextInt ();
//        System.out.println (maxNum (x,y,z) );
//    }
    //求阶乘
    public static int fac(int x ){
        int num = 1;
        for (int i = 1; i <= x ; i++) {
            num*=i;
        }
        return num;
    }
    public static void main3(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt ();
        System.out.println (fac (x) );
    }
    //阶乘和
    public static int fact(int x){
        int ret = 1;
        int sum = 0;
        for (int i = 1; i <= x ; i++) {
            ret*=i;
            sum+=ret;
        }
        return sum;
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt ();
        System.out.println (fact (x) );
    }
    //迭代 斐波那契
    public static int fib(int x) {
        int num = 0;
        if (x ==1||x==2) {
            num = 1;
        }
        if (x > 2) {
            num = fib (x-1)+fib (x-2);
        }
        return num;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner (System.in);
        int x = scan.nextInt ();
        System.out.println (fib (x));
    }
}
