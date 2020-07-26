import javafx.scene.SceneAntialiasing;

import java.util.Random;
import java.util.Scanner;

/**
 * program:
 * description:逻辑运算
 * author: 陈一坤
 * date:
 **/
public class Test1 {
    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    public static void main(String[] args) {
        int count =3;
        int num =595097595;
        System.out.println ("请输入密码" );
        Scanner scanner=new Scanner (System.in);
        int m = scanner.nextInt ();
    }
    //乘法口诀表
    public static void main9(String[] args) {
        int ret =0;
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                ret =i*j;
                System.out.print (i+"*"+j+"="+ret+" ");
            }
            System.out.println (" " );
        }
    }
    //输出一个整数的每一位
    public static void print(int x){
        if (x >9) {
            print (x/10);
        }
        System.out.print (x%10+" ");
    }
    public static void main8(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int m = scanner.nextInt ();
        print (m);
    }
    //获取一个数二进制序列中所有的偶数位和奇数位
    public static void main7(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int m = scanner.nextInt ();
        System.out.print("偶数位是" );
        for (int i = 31; i >0 ; i-=2) {
            System.out.print (((m >> i) & 1) +" ");
        }
        System.out.println (" " );
        System.out.print("奇数位是" );
        for (int i = 30; i >=0 ; i-=2) {
            System.out.print (((m >> i) & 1) +" ");
        }
    }
    //二进制1的个数
    public static void main6(String[] args) {
        int count =0;
        Scanner scanner=new Scanner (System.in);
        int m = scanner.nextInt ();
        for (int i = 0; i <=31; i++) {
            if (((m>>i)&1)==1){
                count++;
                m=m>>1;
            }
        }
        System.out.println (count );
    }
    //求两个正整数的最大公约数
    public static void main5(String[] args) {

    }
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main4(String[] args) {
        double n=0;
        for (int i = 1; i <=100 ; i++) {
            n+=1.0/i* Math.pow (-1,i+1);
        }
        System.out.println (n );
    }
    //求出0～999之间的所有“水仙花数”并输出。
    public static void main3(String[] args) {
        for (int i = 0; i <=999; i++) {
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            int x=a*a*a+b*b*b+c*c*c;
            if (i>=3&&x==i) {
                System.out.println (i );
            }
        }
    }
    //猜数字
    public static void main2(String[] args) {
        Random random =new Random (  );
        int toGuess =random.nextInt (100);//生成随机数
        Scanner scanner =new Scanner (System.in);
        int num = scanner.nextInt ();//录入要猜的数字
        while (true){
            if (num > toGuess) {
                System.out.println ("猜大了" );
            }else if(num < toGuess) {
                System.out.println ("猜小了" );
                }else System.out.println ("猜对了" );
            break;
            }
        }
    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main1(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int age = scanner.nextInt ();
        if (age <= 18) {
            System.out.println ("少年" );
        }else if (age>18&&age <= 28){
            System.out.println ("青年" );
        }else if (age>28&&age<=55) {
            System.out.println ("中年" );
        }else if(age>=56) {
            System.out.println ("老年" );
        }
    }
}
