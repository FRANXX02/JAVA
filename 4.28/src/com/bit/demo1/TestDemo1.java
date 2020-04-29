package com.bit.demo1;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println(this.name+"吃");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
}
class GardenCat extends Cat{
    public GardenCat(String name) {
        super(name);
    }
    public void sleep(){
        System.out.println(this.name+"爱睡觉");
    }
}
class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"飞");
    }
    }
public class TestDemo1 {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        Bird bird = new Bird("八哥") ;
        GardenCat gardenCat = new GardenCat("喵喵");
        cat.eat();
        bird.fly();
        gardenCat.sleep();
    }
}
