package project02.demo.service;

import project02.demo.bean.Customer;

/**
 * CustomerList为Customer对象的管理模块，内部使用数组管理一组Customer对象
 */
public class CustomerList {
//    public static void main(String[] args) {
//        CustomerList cust1 =new CustomerList(5);
//        cust1.addCustomer(new Customer("lisa",'女',20,"1234567788","12345@qq.com"));
//        cust1.addCustomer(new Customer("Tom",'男',20,"1234567788","12345@qq.com"));
//        System.out.println(cust1.getCustomer(0));
//        cust1.replaceCustomer(0,new Customer("lili",'女',20,"1234567788","12345@qq.com"));
//        System.out.println(cust1.getCustomer(0));
//        System.out.println(cust1.deleteCustomer(0));
//        System.out.println(cust1.getAllCustomers());
//        System.out.println(cust1.getTotal());
//    }
    private Customer[] customers;  //用来保存客户对象的数组
    private int total = 0;   // 记录已保存客户对象的数量

    /**
     * 构造器，用来初始化customers数组
     * @param totalCustomer 指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];   //动态初始化
    }

    /**
     * 返回数组中记录的所有客户对象
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     */
    public Customer[] getAllCustomers() {
        Customer[] custs=new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i]=customers[i];
        }
        return custs;
    }

    /**
     * 返回参数index指定索引位置的客户对象记录
     * @param index 指定所要获取的客户在数组中的索引位置，从0开始
     * @return 封装了客户信息的Customer对象
     */
    public Customer getCustomer(int index) {
        if(index<0 || index>=total){
            return null;
        }
        return customers[index];
    }
    //获取存储的客户的数量
    public int getTotal() {
        return total;
    }

    /**
     * 将参数customer添加到数组中最后一个客户对象记录之后
     * @param customer customer指定要添加的客户对象
     * @return 添加成功返回true；false表示数组已满，无法添加
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        } else {
//            System.out.println("数组已满，无法添加");
            return false;
        }
    }

    /**
     * 用参数customer替换数组中由index指定的对象
     * @param index index指定所替换对象在数组中的位置，从0开始
     * @param cust  customer指定替换的新客户对象
     * @return 替换成功返回true；false表示索引无效，无法替换
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        } else {
//            System.out.println("索引无效，无法替换");
            return false;
        }
    }

    /**
     * 从数组中删除参数index指定索引位置的客户对象记录
     * @param index  指定所删除对象在数组中的索引位置，从0开始
     * @return 删除成功返回true；false表示索引无效，无法删除
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < total) {
            for (int i = index; i < total-1; i++) {
                customers[i]=customers[i+1];
            }
            //最后的元素要置空
            customers[total-1]=null;
            total--;
            //或者
//            customers[--total]=null;
            return true;
        } else {
            System.out.println("索引无效，无法删除");
            return false;
        }
    }



}
