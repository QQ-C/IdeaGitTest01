package test05.demo;

/**
 * 面向对象特征之二：继承性
 * 好处： 减少代码的冗余；便于功能的扩展；为之后多态性的使用提供前提
 * 格式： class A extends B{}
 *      A：子类、派生类、subclass
 *      B：父类、超类、基类、superclass
 * 2.1体现： 一旦子类A继承了父类B以后，子类A中就获取了父类B中声明的结构：属性、方法
 *       特别的，父类中声明为private的属性或方法，子类继承父类之后，仍然可认为获取了父类中的私有的结构
 *       只是因为封装性的影响，使得子类不能直接调用父类的结构而已
 * 2.2 子类继承父类之后，还可以声明自己特有的属性或方法，实现功能的扩展
 * 2.3 规定：
 *      一个类可以被多个子类继承
 *      单继承性：一个类只能有一个父类
 *      子父类是相对关系
 *      直接父类和间接父类
 *      子类获取了直接父类和间接父类的所有结构
 *
 *  2.4:如果没有显式的声明一个类的父类，则此类继承于 java.lang.Object 类
 *       所有的Java类都直接或间接的继承于 java.lang.Object 类
 *       所有的Java类 具有java.lang.Object类声明的功能
 *
 */

/**
 * 方法的重写：子类继承父类之后，可以对父类中重名参数的方法，进行覆盖操作
 * 应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名参数的方法时，实际执行的是子类重写父类的方法
 *
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(1);
        p1.eat();

        Student s1=new Student();
        s1.eat();
        s1.sleep();
        s1.name="Tom";
        s1.setAge(11);
        System.out.println(s1.getAge());
        s1.breath();
    }
}
