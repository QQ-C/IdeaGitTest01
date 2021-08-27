package test04.demo;

/**类的结构之三：构造器（或者构造方法、constructor）的使用
 * 一、构造器的作用：
 *      创建对象
 *      初始化对象的信息
 *
 * 二、说明：
 * 1.如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器；
 * 2. 定义构造器的格式： 权限修饰符 类名（形参列表）{}
 * 3. 一个类中定义的多个构造器，彼此构成重载
 * 4. 一旦我们显式的定义了类的构造器之后，系统就不在提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器
 */
/**
 * 属性赋值的先后顺序
 *  1、默认初始化
 *  2、显式初始化
 *  3、构造器中赋值
 *  4、通过“对象.方法”或者“对象.属性”方式
 */
public class ConstructorTest01 {
    public static void main(String[] args){
        //创建类的对象  new + 构造器
        Person0401 p1 = new Person0401();
        p1.eat();
        Person0401 p2=new Person0401("Tom");
        System.out.println(p2.name);

    }
}

class Person0401{
    //属性
    String name;
    int age;

    //构造器
    public Person0401(){
        System.out.println("Person0401().....");
    }
    public Person0401(String n){
        name=n;
    }
    public Person0401(String n, int a){
        name=n;
        age=a;
    }

    //方法
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}