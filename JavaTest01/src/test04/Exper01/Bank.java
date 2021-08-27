package test04.Exper01;

//银行信息  顾客 信息及人数
public class Bank {
    private Customer[] customers;    //存放多个客户的数组
    private int numberOfCustomer;    //记录客户的个数

    public Bank() {
        customers =new Customer[10];
    }

    /**
     * 添加客户
     * addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer 对象，然后把它放到 customer 数组中。
     * 还必须把 numberOfCustomer 属性的值加 1 。
     *
     * @param f
     * @param l
     */
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;

    }

    //获取客户的个数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取指定位置上的客户
     * getCustomer 方法返回与给出的 index 参数相关的客户。
     *
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {

        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}
