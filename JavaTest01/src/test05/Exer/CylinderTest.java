package test05.Exer;

public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.0);
        cylinder.setLength(2.0);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());
    }
}
