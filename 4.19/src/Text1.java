/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Student{
    public Student(String name) {
        this.name = name;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
    public void show(int x){
        System.out.println(x);
    }

}
public class Text1 {

    public static void main(String[] args) {
        Student student = new Student("");
        student.setName("陈一坤");
        String ret = student.getName();
        System.out.println(ret);
        String ret2 = student.toString();
        System.out.println(ret2);
        student.show(19);
    }
}
