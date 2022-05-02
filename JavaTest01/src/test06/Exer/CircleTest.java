package test06.Exer;

import test03.exer.CircleExer01;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(3.4);
        System.out.println("c1的id："+c1.getId()+"  c2的id："+c2.getId());
        System.out.println("创建圆的个数："+Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;
    private static int total;   //创建的圆的个数
    private static int init=1001; //多个对象共享

    public Circle(){
        id=init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius=radius;
//        id=init++;
//        total++;
    }

    public double findArea(){
        return 3.14*radius*radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }
}