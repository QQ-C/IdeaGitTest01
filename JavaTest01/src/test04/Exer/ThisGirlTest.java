package test04.Exer;

public class ThisGirlTest {
    private String name;
    private int age;

    public ThisGirlTest() {

    }

    public ThisGirlTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(ThisBoyTest boy){
        System.out.println("I want to marry the boy: "+boy.getName());
        boy.marry(this);
    }

    /**
     * 比较两个对象的大小
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
     */
    public int compare(ThisGirlTest girl){
//        if(this.age>girl.age){
//            return 1;
//        }else if(this.age<girl.age){
//            return -1;
//        }else{
//            return 0;
//        }
        return this.age - girl.age;

    }

}
