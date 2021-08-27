package test04.demo;

/**
 * this关键字的使用:
 * 1、this可以用来修饰、调用：属性、方法、构造器
 *
 * 2、this修饰属性和方法：
 *        this理解为：当前对象 或者当前正在创造的对象
 *     2.1、在类的方法中，我们可以使用“this.属性”或者“this.方法”的方式，调用当前对象属性或方法
 *          但是通常省略“this.”。
 *          特殊情况：当方法的形参和类的属性同名时，我们必须显式的使用“this.变量”的方式，表明此变量是属性，而不是形参
 *     2.2、在类的构造器中，我们可以使用“this.属性”或者“this.方法”的方式，调用当前正在创建的对象属性或方法
 *          但是通常省略“this.”。
 *          特殊情况：当构造器的形参和类的属性同名时，我们必须显式的使用“this.变量”的方式，表明此变量是属性，而不是形参
 *
 * 3、this 调用构造器
 *      1、在类的构造器中，可以显式的使用“this（形参列表）”方式，调用本类中指定的的其他构造器
 *      2、构造器不能通过“this（形参列表）”方式调用自己
 *      3、如果一个类中有n个构造器，则最多有n-1构造器中使用了“this（形参列表）”
 *      4、“this（形参列表）”必须声明在当前构造器的首行
 *      5、构造器内部，最多只能声明一个“this（形参列表）”，用来调用其他的构造器
 *
 *
 *
 */
public class ThisTest01 {
    public static void main(String[] args){
        ThisPerson01 p1 = new ThisPerson01();
        p1.setAge(1);
        System.out.println(p1.getAge());
        p1.eat();
        System.out.println();
        ThisPerson01 p2 = new ThisPerson01("Jerry",20);
        System.out.println("name:"+p2.getName()+", age:"+p2.getAge());
    }
}

class ThisPerson01{
    private String name;
    private int age;
    public ThisPerson01(){
        System.out.println("此处有40行初始化代码");
    }
    public ThisPerson01(String name){
        this();
        this.name=name;
    }
    public ThisPerson01(int age){
        this();
        this.age=age;
    }
    public ThisPerson01(String name,int age){
        this(age);
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("eating...");
        this.study();
    }
    public void study(){
        System.out.println("studying...");
    }

}