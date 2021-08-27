package test04.Exper;

/**
 * 创建一个测试程序
 * 1、创建一个Customer，名字叫Jane Smith, 他有一个账号为1000，余额为2000元，年利率为1.23%
 * 2、对Jane Smith操作
 * 存入100元，再取出960元，再取出2000元
 * 打印Jane Smith基本信息
 * Customer [Smith, Jane] has an account: id is 1000, annualInterestRate is
 *
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account acct = new Account(1000,2000,0.0123);
        cust.setAccount(acct);
        cust.getAccount().deposite(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);
        System.out.println("Customer["+cust.getLastName()+","+cust.getFirstName()+
                "] has an account:id is "+cust.getAccount().getId()+", annualInterestRate is:"+
                cust.getAccount().getAnnualInterestRate()*100+"%,balance is:"+cust.getAccount().getBalance());
    }
}
