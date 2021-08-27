package test04.Exer;

public class ThisBoyTest {
    private String name;
    private int age;

    public ThisBoyTest() {

    }
    public ThisBoyTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(ThisGirlTest girl){
        System.out.println("I want to marry the girl: " + girl.getName());
    }
    public void shout(){
        if(this.age>=23){
            System.out.println("You can marry");
        }else{
            System.out.println("You can't marry");
        }
    }
}
