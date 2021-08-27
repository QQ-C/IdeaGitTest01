package test04.Exer;
/**
 * 创建程序 在其中定义两个类： Person 和 PersonTest 类 。
 * 在 PersonTest 类 中实例化 Person 类的对象 b 调用 setAge 和getAge 方法 ;
 * 体会 Java 的封装性 。
 */
public class PersonTest01 {
    public static void main(String[] args){
        Person01 p1=new Person01();
        p1.setAge(12);
        System.out.println("age: "+p1.getAge());
        Person01 p2=new Person01("Tom",21);
        System.out.println("name: "+p2.getName()+", age: "+p2.getAge());

    }
}
