package test04.Exer;
/**编写两个类 TriAngle 和 TriAngleTest
 * 其中 TriAngle 类 中 声明私有的底边长 base 和高 height 同时声明公共方法访问 私有变量 。 此外 提供类必要的构造器 。
 */
public class TriAngle {
    private double base; //底边长
    private double height;  //高

    public TriAngle(){

    }
    public TriAngle(double b,double h){
        base=b;
        height=h;
    }

    public void setBase(double b){
        base=b;
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h){
        height=h;
    }
    public double getHeight(){
        return height;
    }
}
