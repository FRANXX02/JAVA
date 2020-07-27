/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age , String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person person=new Person (15,"陈一坤");
        System.out.println (person );//构造方法
        person.setAge (15);
        person.setName ("chen");
        System.out.println (person.getAge () );
        System.out.println (person.getName ( ));


    }
}
