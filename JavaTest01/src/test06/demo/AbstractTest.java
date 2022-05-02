package test06.demo;

/**
 * abstract 关键字的使用
 * abstract 可以修饰的结构： 类、方法
 * abstract 修饰类：抽象类
 *          此类不能实例化
 *          抽象类中一定有构造器，便于子类对象实例化时调用（涉及子类对象实例化的全过程）
 *          开发中提供抽象类的子类，让子类对象实例化，实现相关的操作
 * abstract 修饰方法：抽象方法
 *          抽象方法只有方法的声明，没有方法体
 *          包含抽象方法的类一定是抽象类；反之，抽象类中可以没有抽象方法
 *          若子类重写了父类中的所有抽象方法之后，次子类方可实例化
 *          若子类没有重写父类中的所有抽象方法，则子类也是一个抽象类，需要使用abstract修饰
 *  注意：
 *      abstract不能用来修饰属性、构造器等结构
 *              不能用来修饰私有方法、静态方法、final的方法、final的类
 *
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person01类抽象了，就不能实例化
//        Person01 p1=new Person01();
//        p1.eat();
    }
}

abstract class Person01{
    String name;
    int age;
    public Person01(){

    }
    public Person01(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("walking");
    }
}

abstract class Student extends Person01{

}