package test05.Exer;

// 计算圆的面积
public class Circle {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * 计算圆的面积
     *
     * @return 圆的面积
     */
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
