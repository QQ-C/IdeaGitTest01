package test04.Exer;

 // 定义如下：用setAge 设置人的合法年龄 0-130 用 getAge 返回人的年龄 。
/** 2、在前面定义的 Person 类中添加构造器 利用构造器设置所有人的 age 属性初始值都为 18 。
 * 修改上题中类和构造器 增加 name 属性 使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值 。
 */

public class Person01 {
    private int age;
    private String name;

    public Person01(){
        age=18;
    }
    public Person01(String n,int a){
        name=n;
        age=a;
    }
    public void setAge(int a){
        if(a<0||a>130){
            //throw new RuntimeException("传入的数据不合格");
            System.out.println("传入的数据不合格");
            return;
        }
        age =a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
