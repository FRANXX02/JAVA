/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Car {
    private String brand;
    private String size;
    private String color;
    private int id;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand'" + brand + '\'' +
                ", size'" + size + '\'' +
                ", color'" + color + '\'' +
                ", id" + id +
                '}';
    }
    public void show(){
        System.out.println("hei"+brand+"lalal"+color+"dadada");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Car one = new Car();
        one.setColor("黑色");
        String color = one.getColor();
        one.setBrand("雪铁龙");
        String brand = one.getBrand();
        one.setSize("超跑");
        String size = one.getSize();
        one.setId(666666);
        int id = one.getId();
        //one.show();
        System.out.println(one);
        one.show();
    }
}
