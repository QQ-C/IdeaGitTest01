package test06.demo;

/**
 * static 关键字的使用
 * 1. static：静态的
 * 2. static可以用来修饰：属性、方法、代码块、内部类
 * 3. 使用static修饰属性： 静态变量（类变量）
 *      3.1 属性 按照是否使用static修饰，又分为：静态属性 VS 非静态属性（实例变量）
 *         实例变量：当创建类的多个对象，每个对象都独立拥有一套类中的非静态属性。当修改其中一个对象中的非静态属性时，不会导致其他对象的修改
 *         静态变量：当创建类的多个对象，多个对象共享同一个静态变量。通过某一个对象修改静态变量，会导致其他对象的静态变量的修改。
 *      3.2 static 修饰属性的其他说明
 *          静态变量随着类的加载而加载 . 可以通过“类.静态变量”的方式进行调用
 *          静态变量的加载要早于对象的创建
 *          类只会加载一次，所以静态变量在内存中只会存在一份。存在方法区的静态域中
 *
 *          类变量  实例变量
 *        类   yes   no
 *        对象 yes    yes
 *       3.3 静态属性举例： System.out；Math.PI
 * 4. 使用static修饰方法：静态方法
 *      随着类的加载而加载,可以通过“类.静态方法” 的方式进行调用
 *      静态方法中，只能调用静态方法或者属性
 *      非静态方法中，既可以调用非静态方法或属性也可以调用静态方法或属性
 *
 * 5. static 注意点
 *      在静态方法内，不能使用this关键字，super关键字
 *      关于静态属性和静态方法的使用，从生命周期去理解
 * 6. 开发中，如何确定属性是否要声明为static
 *      属性时可以被多个对象所共享，不会随着对象的不同而不同
 *
 *   开发中，如何确定一个方法是否要声明为static
 *       操作静态属性的方法，通常设置为static
 *       工具类中的方法习惯上声明为static  比如Math Arrays
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese.nation="中国";

        Chinese c1=new Chinese();
        c1.name="yaoming";
        c1.age=40;
        c1.nation="CHN";
        System.out.println(c1.nation);

        Chinese c2=new Chinese();
        c2.name="malong";
        c2.age=30;
        c2.nation="China";
        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c1.eat();
        Chinese.show();
    }
}
//类：中国人
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.info();
        System.out.println("name:"+name);
        //调用静态结构
        walk();
        System.out.println("nation:"+Chinese.nation);
    }

    public static void show(){
        System.out.println("我是一个中国人");
        //不能调用非静态结构
//        eat();
//        name="Tom";
        //可以调用静态结构
        System.out.println(Chinese.nation);
        walk();
    }
    public void info(){
        System.out.println("name:"+name+",age:"+age);
    }
    public static void walk(){
        System.out.println("walking");
    }
}