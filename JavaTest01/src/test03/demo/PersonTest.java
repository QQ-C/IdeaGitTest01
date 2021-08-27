package test03.demo;

/**一、设计类，就是设计类的成员
 * 属性=成员变量 = field =域、字段
 * 方法=成员方法=函数=method
 *
 * 创建类的对象 = 类的实例化 = 实例化类
 *
 * 二、类和对象的使用（面向对象思想落地的实现）
 * 1.创建类，设计类的成员 （属性和方法）
 * 2.创建类的对象  （new）
 * 3.通过“对象.属性”或“对象.方法”调用对象的结构
 *
 * 三、如果创建一个类的多个对象，则每个对象都独立的拥有一套类的属性 （非static）
 * 即修改一个对象的属性a、不会影响另一个对象的属性a
 *
 * 四、内存解析
 */

public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象
        Person person1 = new Person();

        //调用对象的结构：属性、方法
        //调用属性：“对象.属性”
        person1.name = "Tom";
        person1.isMale=true;
        System.out.println(person1.name);

        //调用方法：“对象.方法”
        person1.eat();
        person1.sleep();
        person1.talk("Chinese");

        //***********
        Person person2 = new Person();
        System.out.println(person2.name);  //null
        //************
        Person person3=person1;
        System.out.println(person3.name);   //Tom
    }
}

/**类中属性的使用
 * 属性（成员变量）VS 局部变量
 * 1、相同
 * 定义变量的格式：数据类型 变量名=变量值
 * 先声明后使用
 * 变量尤其对应的作用域
 *
 * 2、不同
 * 在类中声明的位置不同
 * 属性：直接定义在类的一对{}内
 * 局部变量：声明在方法内，方法形参，代码块内、构造器形参、构造器内
 *
 * 关于权限修饰符的不同
 * 属性：可以在声明属性时，指明其权限 使用权限修饰符  private public 缺省 protected  ----》封装性
 * 局部变量：不能使用权限修饰符
 *
 * 默认初始化值：
 * 属性：类的属性根据类型有默认初始化值 整型：0；浮点型：0.0 布尔型：false 引用数据类型：null
 * 局部变量（local）：没有初始化值
 *
 * 在内存中加载位置不同
 * 属性：加载到堆空间中 （非static）
 * 局部变量：加载到栈空间中
 */

/**类中方法的使用
 * 方法：描述类应该具有的功能
 * Math类：sqrt（）  random（）
 * Arrays类： toString（） sort（）
 * 有无形参  有无返回值
 * 方法的声明：
 * 权限修饰符 返回值类型 方法名（形参列表）{
 *     方法体
 * }
 * 权限修饰符：private public 缺省 protected   ---》封装性
 * 返回值类型：有返回值  没有返回值
 * 有返回值时，必须在方法声明时指定返回值的类型；同时需要用return关键字来返回指定类型的变量或者常量
 * 没有返回值则使用void    不用return或者return；（结束此方法）其后不可在声明其他语句
 * 方法名：命名规则 “见名知意”
 * 形参列表： 数据类型1 形参1，数据类型2 形参2
 * 方法体：方法功能的体现
 *
 * return：使用方法体中
 * 作用1，结束方法；
 * 作用2，针对有返回值类型的方法， 使用  return 数据   返回要用的数据
 * return后面不可以声明执行语句
 *
 * 方法的使用：
 * 使用中可以调用当前类的属性和方法、
 * 方法中不可以定义方法
 */
class Person{
    //属性 （成员变量）
    String name;
    int age;
    boolean isMale;
    //方法
    public void eat(){
        String food = "馒头";    //局部变量
        System.out.println("Eating Food."+food);
    }
    public void sleep(){
        System.out.println("Sleeping.");
    }
    public void talk(String language){    //形参
        System.out.println("Speak: "+ language);
    }
    public String getName(){
        return name;
    }

}
