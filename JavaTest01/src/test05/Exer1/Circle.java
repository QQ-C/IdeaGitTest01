package test05.Exer1;
// 子类 Circle 代表圆形。

public class Circle extends GeometricObject {
    private double radius;

    //初始化对象的color 属性 为“ white” weight 属性1.0 radius 属性为 1.0 。
    public Circle() {
        super();  //已经初始化了两个参数
        radius = 1.0;
    }

    //初始化对象的color 属性为“ white” weight 属性为 1.0 radius 根据参数构造器确定。
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
//        this.color=color;
//        this.weight=weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    //重写equals 方法 比较两个圆的半径是否相等，如相等，返回 true 。
    public boolean equals(Object obj) {
        if (this == obj) {  //地址是否相同
            return true;
        }
        if (obj instanceof Circle) {   //是否是实例
            Circle c = (Circle) obj;  //强制类型转换
            return this.radius == c.radius;
        }
        return false;
    }

    //重写toString 方法 输出圆的半径。
    public String toString(){
        return "Circle [radius="+radius+"]";
    }
}
