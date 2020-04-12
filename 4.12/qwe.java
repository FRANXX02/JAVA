import java.util.Scanner;
public class qwe{
    public static  int sum(int a){
        if(a < 10){
            return a;
        }
         returna % 10 + sum(a / 10);
    }
    public static int add( int a, int b, int c){
        return(a + b + c) ;
    }
    public  static  double add(double a, double b, double c){
        return(a + b + c) ;
    }


    public static void main(String[] args) {
        int a =10;
        int b =20;
        int aa = add(a,b)
    }


    //bijiaodadaxiao1
    public static int maxNum(int num1,int num2,int num3){
        return num1 > num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 18;
        int ret = maxNum(num1,num2,num3);
        System.out.println(ret);
    }
    //二进制一的个数
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int count = 0;
        for(int i = 1;i < 32;i++){
            if(((a>>i)& 1)  == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}