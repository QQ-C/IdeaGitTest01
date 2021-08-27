package test04.Exer;

/**使用TriAngle中的公共方法 计算三角形的面积
 */
public class TriAngleTest {
    public static void main(String[] args){
        TriAngle t1=new TriAngle();
        t1.setBase(12.5);
        t1.setHeight(13.5);
        System.out.println("base: "+t1.getBase()+" ,height: "+t1.getHeight());
        TriAngle t2=new TriAngle(12.3,15);
        System.out.println("base: "+t2.getBase()+" ,height: "+t2.getHeight());
    }

}
