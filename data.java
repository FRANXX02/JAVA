import java.util.Scanner;
public class data {
    public static void main(String[] args) {
        for(int a =123; a > 0;a = a / 10){

            System.out.println(a);
        }
    }

    public static void main7(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int ranNum = new Random.next(100);
        System.out.println(ranNum);
        while(true){
            System.out.println("请输入要猜的数字 ");
            int num = scan.nextInt();
            if(num < randNum){
                System.out.println("猜小了");
            }else if(num > randNum){
                System.out.println("猜大了");
            }else{
                System.out.println("猜对了");
            }

        }
    }
    //3次密码登录
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count =3;
        while(count != 0){
            System.out.println("请输入密码");
            String password = scan.nextLine();
            if(password.equals("595097595")){
                System.out.println("密码正确，登录成功");
                break;
            }else{
                count--;
                System.out.println("你还有" + count + "次机会");
            }

    }
  }
    //根据年龄判断中老年
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age <=18){
            System.out.println(age + "是少年");
        }if(age >= 19 && age <= 28){
            System.out.println(age + "是青年 ");
        }if(age >= 29 && age <= 56){
            System.out.println(age + "是中年 ");
        }if(age >= 56){
            System.out.println(age + "是老年 ");
        }
    }



    //判断一个属是否为素数
    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 2;i <= (int)Math.sqrt(n);i++){
            if(n / i == 0){
                System.out.println(n + "不是素数");
                break;
            }else{
                System.out.println(n + "是素数");
                break;

            }
        }
    }



    // 数字9出现的次数
    public static void main3(String[] args) {
        int count =0;
        for(int i = 1;i <= 100;i++){
            if(i % 10 == 9){
                count++;
            }else if(i / 10 == 9){
                count++;
            }
        }
        System.out.println(count);
    }
    //打印1000-2000闰年
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int year = 1000; year <= num;year++)
        {
            if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
            {
                System.out.println(year + "是闰年");
            }
        }
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num <= 100) {
            if (num % 15 == 0) {
                System.out.println(num);
                break;
            }
            System.out.println("hahahah");
            num++;
        }
    }
}
