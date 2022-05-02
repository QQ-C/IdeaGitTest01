package test06.demo;

/**
 * final ：最终
 * 1. final可以用来修饰的结构：类、方法、变量
 * 2.final 可以用来修饰一个类：此类不能被其他类所继承
 *           比如String类、System类、StringBuffer类
 * 3.final 用来修饰方法：表明此方法不可以被重写
 * 4. final用来修饰变量： 此时的变量就称为一个常量
 *          final 修饰属性：可以考虑赋值的位置有：显式初始化、代码块中初始化、构造器中初始化
 *          final 修饰局部变量：
 *              final修饰形参时，表明此形参是一个常量。调用此方法时，非常量形参赋值之后。在方法体内使用此形参，不能重新进行赋值
 *
 *  static final ： 用来修饰属性---全局常量
 */
public class FinalTest {
    final int width =10;
    final int LEFT;
    final int RIGHT;
//    final int DOWN;

    {
        LEFT=10;
    }
    public FinalTest(){
        RIGHT=10;
    }
    public FinalTest(int n){
        RIGHT=n;
    }
//    public void setDOWN(int DOWN){
//      this.DOWN=DOWN;    //no
//    }
    public void doWidth(){
//        width=20;   //不可
        final int NUM=10;//常量
//        NUM+=10;
    }
    public void show(final int num){
//        num =20;   //no
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 10;
        num =num+5;
        FinalTest test =new FinalTest();
        test.show(10);
    }
}

final class finalA{

}
//不可
//class B extends finalA{
//
//}
//不可
//class C extends String{
//
//}
class AA{
    public final void show(){

    }
}
//class BB extends AA{
//不可
//    public void show(){
//
//    }
//}