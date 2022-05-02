package test06.demo;

/**
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是并列的两个结构
 * 3.定义接口及其成员
 *      3.1 jdk7及以前：只能定义全局常量和抽象方法
 *          全局常量：public static final   ,但是书写时可以省略不写
 *          抽象方法：public abstract
 *
 *      3.2 jdk8：除了上述全局常量和抽象方法之外，还可以定义静态方法和默认方法
 *          接口中定义的静态方法，只能通过接口来调用
 *          通过实现类的对象，可以调用接口中的默认方法；如果实现类重写了接口中的默认方法，调用时，是重写以后的方法
 *          如果子类继承的父类和实现类有相同名称的方法，且子类没有重写，则实现的是父类中的方法---类优先原则
 *
 * 4.接口中不能定义构造器,意味着接口不能实例化
 * 5.Java开发中接口都通过让类实现（implement）的方式来使用
 *   如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *   如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为抽象类
 *6. java类可以实现多个接口-----》弥补了类的单继承性的局限性
 * 格式：class AA extends BB implements CC,DD,EE
 * 7. 接口和接口之间可以继承，多继承
 * 8.接口的使用体现多态性
 * 9.接口实际上可以看成一种规范
 *
 * 抽象类与接口有哪些异同？
 *
 */
public class InterfaceTest {
    public static void main(String[] args){
        System.out.println(Flyable.MAX_SPEED);
        Plane plane=new Plane();
        plane.fly();
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED =1; //省略了public static final
    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();
}

interface Attackable{
    void attack();
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void stop() {
        System.out.println("stoping");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {
        System.out.println("kite flying");
    }

}
class Bullet implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}

interface AAA{

}
interface BB{

}
interface CC extends AAA,BB{

}