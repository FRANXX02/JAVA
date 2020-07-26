import java.util.concurrent.Callable;

/**
 * program:
 * description:类和对象
 * author: 陈一坤
 * date:
 **/

public class Test3 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator ();
        calculator.num1=10;
        calculator.num2=20;
        System.out.println (calculator.sum (calculator.num1 , calculator.num2));
        System.out.println (calculator.eve (calculator.num1 , calculator.num2));
        System.out.println (calculator.ret (calculator.num1 , calculator.num2));
        System.out.println (calculator.chu (calculator.num1 , calculator.num2));
    }
}
