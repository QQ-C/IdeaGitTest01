package test04.Exper01;

//客户信息 名 姓  账户
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;    //在自定义的类当中，是可以声明另外一个类的属性的

    public Customer(String f,String l){
        this.firstName=f;
        this.lastName=l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
