import java.util.Scanner;

/**
 * program:程序逻辑
 * description:
 * author: 陈一坤
 * date:
 **/
public class Test { //判断素数
    public static void main3(String[] args) {
        Scanner scanner =new Scanner (System.in);
        int x = scanner.nextInt ();//x=9
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt (x) ; i++) {
            if (x%i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println ("素数" );
        }else{
            System.out.println ("不是素数" );
        }
    }
    //求1到100间的素数
    public static void main2(String[] args) {
        System.out.print ("2 " );
        for (int i = 3; i <=100 ; i+=2) {
            boolean flag = true;
            for (int j = 3; j <=Math.sqrt (i)  ; j+=2) {
                if (i%j==0) {
                    flag= false;
                    break;
                }
            }
            if (flag){
                System.out.print(i+" " );
            }
        }
    }
    //闰年
    public static void main1(String[] args) {
        for (int i = 1000; i <=2000 ; i++) {
            if (i%4==0&&i%100!=0||i%400==0) {
                System.out.println (i);
            }
        }
    }
}
