package test04.demo;

/**
 * 面向对象的特征之一：封装与隐藏
 * 一、问题的引入：
 * 当我们创建一个类的对象以后，我们可以通过“对象.属性”的方式，对对象的属性进行赋值，这里赋值操作要受到属性的数据类型和存储范围的制约
 * 但是除此之外，没有其他制约条件，实际问题中往往需要给属性赋值加入额外的限制条件，
 * 并且这个条件不能在属性声明时体现，只能通过 方法 进行限制条件的添加（比如 setLegs() ）
 * 同时 避免 用户再使用“对象.属性”的方式对属性进行赋值，则需要将属性声明为私有的（private）
 * 此时，针对于属性就体现了封装性。
 *
 *二、封装性的体现：
 * 将类的属性私有化（private），同时，提供公共的（public）方法来获取（getXxx）和设置（setXxx）此属性的值
 *拓展： 不对外暴露的私有的方法；单例模式；
 *
 * 三、权限修饰符
 * 1、Java规定了四种权限：从小到大：private 、 缺省、 protected 、public
 * 2、4种权限可以用来修饰类以及类的内部结构：属性、方法、构造器、内部类
 * 3、具体：4中权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *         修饰类的话，只能使用：缺省、public
 *
 *    public 在同一个工程下都可以调用（不同包之间也可以调用）
 *    缺省：在同一个包内可以
 *    private：只能在该类中使用
 *
 *    protect:不同包的子类
 *
 * 封装性总结：
 *      Java提供了四种权限修饰符来修饰类以及类的内部结构，体现类以及类的内部结构在被调用时的可见性的大小
 */
public class AnimalTest {
    public static void main(String[] args){
        Animal a=new Animal();
        a.name="大黄";
        a.age=1;
        //a.legsNum=4;         //legsNum' has private access in 'test04.demo.Animal'
        a.show();
        a.setLegs(-6);
        a.show();
    }
}

class Animal{
    String name;
    int age;
    private int legsNum;   //个数
    //对 属性 的设置
    public void setLegs(int l){
        if(l>=0 && l%2==0){
            legsNum=l;
        }else{
            legsNum=0;
            //抛出一个异常
        }
    }
    //对属性的获取
    public int getLegsNum(){
        return legsNum;
    }

    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name= "+name+",age= "+age+",legsNum= "+legsNum);
    }
}