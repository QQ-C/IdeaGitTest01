package test06.Exer02;

/**
 * 定义一个 测试类 ComparableCircleTest 创建两个 ComparableCircle 对象 调用 compareTo方法比较两个类的半径大小 。
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(0.8);
        ComparableCircle c2 = new ComparableCircle(0.96);
        int compareValue = c1.compareTo(c2);
        if(compareValue>0){
            System.out.println("c1 > c2");
        }else if(compareValue<0){
            System.out.println("c1 < c2");
        }else{
            System.out.println("c1 = c2");
        }
    }

}
