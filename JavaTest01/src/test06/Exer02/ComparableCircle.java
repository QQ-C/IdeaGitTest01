package test06.Exer02;

/**
 * 定义一个 ComparableCircle 类 继承 Circle 类并且实现 CompareObject 接口 。
 * 在ComparableCircle 类中给出接口中方法 compareTo 的实现体 用来比较两个圆的半径大小
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(this==o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            if(this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }else{
                return 0;
            }
        }else{
//            return 0;
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }
}
