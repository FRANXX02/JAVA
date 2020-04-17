/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Person{
    public String name;   //实例成员变量 (可以定义，可以不定义
    private String sex;
    private int age;
    public static int id;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    //静态成员变量
    public void eat() {             //行为->方法
        System.out.println("吃饭");
    }
    public static void sleep(){
        System.out.println("睡觉");
    }
    public void show(){
        System.out.println("我叫 " + name + " 性别 "+ sex + " 年龄 "+ age);
    }
}
public class Text2 {
    public static void main(String[] args) {
        Person per = new Person();
        //访问静态成员变量   类名+静态成员变量
        System.out.println(Person.id);
        per.setAge(17);
        int age = per.getAge();
        System.out.println(per.getSex());
        //实例成员方法的调用
        per.setSex("男");
        per.name = "chen";
        //per.age = 18;
        per.show();
        per.eat();
        //静态成员方法的调用
        Person.sleep();

    }
    public static void main1(String[] args) {
        //如何访问实例化对象   对象名+实例成员变量
        Person one = new Person();
        Person two = new Person();
        System.out.println(one.name);
       /* System.out.println(one.sex);
        System.out.println(one.age);
        one.age = 10;
        System.out.println(one.age);*/
    }
}