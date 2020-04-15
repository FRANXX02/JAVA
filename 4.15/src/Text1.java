import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.objects.XStringForChars;

import java.util.Arrays;
import java.util.Scanner;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text1 {
    //奇数位于偶数之前
    public static void swap(int[] arr){
        int i = 0;
        for (; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] % 2 == 0) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr);
    }
    //数组元素扩大2倍
    public static void transform(int[] xrr){
        for (int i = 0; i < xrr.length; i++) {
            xrr[i]*=2;
        }
        System.out.println(Arrays.toString(xrr));
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3,};
        transform(arr);
    }
    // 设置数组1-100
    public static void size(int[] xrr){
        for(int i=0;i<xrr.length;i++){
            xrr[i]=i+1;
        }
        System.out.println(Arrays.toString(xrr));
    }
    public static void main5(String[] args) {
        int[] arr=new int[100];
        size(arr);
    }
    //打印数组
    public static void printArray(int[] arr){
        for (int x:
             arr) {
            System.out.print(x);
            System.out.print(" ");
        }
    }
    public static void main4(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        printArray(arr1);
    }
    //找出现一次的数
    public static int find(int[] arr){
        int len = arr.length;
        int i = 0, sum = 0;
        while(i<len){
            sum = sum ^ arr[i];
            i++;
        }
        return sum;
    }
    public static void main3(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(find(arr));
    }
    //迭代斐波那契数列
    public static int fbc(int x){
        int a = 0;
        int b = 1;
        int c = 0;
        if(x == 1){
            return 1;
        }
        for (int i = 1; i < x; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(fbc(n));

    }
    //汉诺塔（递归）
    public static void move(char ads1, char ads2){
        System.out.print(ads1+"->"+ads2);
        System.out.print(" ");
    }
    public static void hano(int n, char ads1, char ads2, char ads3){
        if(n == 1){
          move(ads1,ads3);
        }else {
            hano(n-1,ads1,ads3,ads2);
            move(ads1,ads3);
            hano(n-1,ads2,ads1,ads3);
        }
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        hano(n,'a','b','c');

    }
}
