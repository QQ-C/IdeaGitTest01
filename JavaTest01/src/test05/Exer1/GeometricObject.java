package test05.Exer1;

//定义两个类，父类 GeometricObject 代表几何形状，
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
}
