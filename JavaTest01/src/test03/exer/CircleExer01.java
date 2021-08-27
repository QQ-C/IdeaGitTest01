package test03.exer;


//利用面向对象编程的方法计算圆的面积

public class CircleExer01 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 1.2;
//        double area = c1.findArea();
//        System.out.println(area);
        c1.findArea();
    }

}

class Circle {
    //属性
    double radius;

    //求圆的面积
//    public double findArea(){
//        double area=Math.PI*radius*radius;
//        return area;
//    }
    public void findArea() {
        double area = Math.PI * radius * radius;
        System.out.println("面积是："+area);
    }
}