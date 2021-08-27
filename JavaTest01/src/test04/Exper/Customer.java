package test04.Exper;

/**
 * 三个私有变量
 * 构造器
 * getter setter方法
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;   //声明另外一个类的变量当成一个属性，这是可以的（String都可以）

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
