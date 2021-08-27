package test05.Exer;
//计算圆柱的体积
public class Cylinder extends Circle {
    private double length;

    public Cylinder(){
        length=1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 计算圆柱的体积
     * @return 体积
     */
    public double findVolume(){
        return findArea()*length;
    }
}
