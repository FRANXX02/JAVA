/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
//构造方法
class Friend{
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    Friend(String name,int age) {
        this.age = age;
        this.name =name;
    }
}
public class Text4 {
    public static void main(String[] args) {
        Friend friend = new Friend("chen",17);
        friend.setName("陈一坤");
        friend.setAge(21);
        System.out.println(friend.getName() + " " + friend.getAge());
    }
}
