package test03.exer;

//测试类
public class PersonExer01 {
    public static void main(String[] args) {
        Person01 p1=new Person01();

        p1.name = "Tom";
        p1.age=18;
        p1.sex=1;

        p1.study();
        p1.showAge();
        int newAge = p1.addAge(2);
        System.out.println(p1.name+"的新年龄是："+newAge);
        System.out.println(p1.age);

    }
}
// 人
class Person01 {
    String name;
    int age;
    /**
     * sex:1表示男生
     * sex:2表示女生
     */
    int sex;

    public void study(){
        System.out.println("Studying");
    }
    public void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}
