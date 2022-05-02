package test06.demo;

/**
 * 类的成员之四：代码块（或初始化块）
 * 1.代码块的作用：初始化类或者对象
 * 2.代码块如果有修饰只能使用static
 * 3.分类：静态代码块  非静态代码块
 * 4.静态代码块
 *      内部可以有输出语句
 *      随着类的加载而执行,且只执行一次
 *      作用，初始化类的属性
 *      如果在类中定义了多个静态代码块，则按照顺序来执行
 *      静态代码块的执行，优先于非静态的加载
 * 5.非静态代码块
 *      内部可以有输出语句
 *      随着对象的创建而执行
 *      每创建一个对象就执行一次非静态代码块
 *      作用，可以再创建对象时，对对象的属性进行初始化
 *      定义多个，按照顺序执行
 *
 * 由父及子，静态先行
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc=Person.desc;
        Person p1 = new Person();
        Person p2 =new Person();

        Person.info();
    }
}
class Person{
    //属性
    String name;
    int age;
    static String desc="我是一个人";
    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    //static代码块
    static{
        System.out.println("hello,static block");
    }
    //非static代码块
    {
        System.out.println("hello,block");
    }
    //方法
    public void eat(){
        System.out.println("eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void info(){
        System.out.println("我是一个快乐的人！");
    }
}