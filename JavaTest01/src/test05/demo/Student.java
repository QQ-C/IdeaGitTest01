package test05.demo;

public class Student extends Person{
//    String name;
//    int age;
    String major;

    public Student(){

    }
    public Student(String name,int age,String major){
        this.setAge(age);
        this.major=major;
        this.name=name;
    }
//    public void eat(){
//        System.out.println("eating...");
//    }
//    public void sleep(){
//        System.out.println("sleeping...");
//    }
    public void study(){
        System.out.println("studying...");
    }
    public void shou(){
        System.out.println("name:"+name+"age:"+getAge());
    }
}
