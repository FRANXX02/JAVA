/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
//加减乘除
class Calcu{
    private int num1;
    private int num2;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public int add(int num1, int num2){
        return (this.num1+this.num2);
    }
    public int as(int num1, int num2){
        return (this.num1-this.num2);
    }
    public int ch(int num1, int num2){
        return (this.num1*this.num2);
    }
    public int yu(int num1, int num2){
        return (this.num1/this.num2);
    }
}
public class Text3 {
    public static void main(String[] args) {
        Calcu num = new Calcu();
        num.setNum1(5);
        int x = num.getNum1();
        num.setNum2(2);
        int y = num.getNum2();
        System.out.println("x+y是"+num.add(x, y));
        System.out.println("x-y是"+num.as(x, y));
        System.out.println("x*y是"+num.ch(x, y));
        System.out.println("x/y是"+num.yu(x, y));
    }
}
