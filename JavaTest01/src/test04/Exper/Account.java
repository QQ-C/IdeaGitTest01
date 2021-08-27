package test04.Exper;

/**
 * 写一个名为Account的类模拟账户。
 * 属性包括：账号 id； 余额 balance； 年利率 annualInterestRate
 * 方法包括：访问器方法（getter Setter）；取款方法withdraw（）；存款方法deposit（）
 */
public class Account {
    private int id;  //账号
    private double balance;  //余额
    private double annualInterestRate;  //年利率

    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    /**
     * 取钱
     * @param amount
     */
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance-=amount;
        System.out.println("成功取出："+amount+"元");
    }

    /**
     * 存钱
     * @param amount
     */
    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("成功存入："+amount+"元");
        }
    }
}
