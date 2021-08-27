package project02.demo.bean;

/**
 * Customer为实体类，用来封装客户信息
 */
public class Customer {
//    public static void main(String[] args) {
//        Customer cust = new Customer();
//        cust.setName("Tom");
//        cust.setAge(18);
//        cust.setEmail("1234567@qq.com");
//        cust.setGender('男');
//        cust.setPhone("123456789");
//        System.out.println("姓名："+cust.getName()+",性别:"+cust.getGender()+",电话号码:"+cust.getPhone()+",电子邮箱:"+cust.getEmail());
//        Customer cust1=new Customer("lisa",'女',20,"1234567788","12345@qq.com");
//        System.out.println(cust1.getName()+","+cust1.getGender()+","+cust1.getPhone()+","+cust1.getPhone()+","+cust1.getEmail());
//    }

    private String name;  //客户姓名
    private char gender;  //性别
    private int age;     //年龄
    private String phone; //电话号码
    private String email;  //电子邮箱

    public Customer(){

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
