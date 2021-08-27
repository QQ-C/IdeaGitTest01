package test05.demo;

public class Person extends Creature {
    String name;
    private int age;
     public Person(){

     }
     public Person(String name,int age){
         this.name=name;
         this.age=age;
     }
     public void eat(){
         System.out.println("eating...");
     }
     public void sleep(){
         System.out.println("sleeping");
     }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
