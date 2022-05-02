package test06.Exer;
/**
 * 编写一个Employee 类，声明为抽象类，
 * 包含如下三个 属性： name id salary 。
 * 提供必要的构造器和抽象方法：work() 。
 * 对于Manager 类来说，他既是员工，还具有奖金 (bonus 的 属性。
 * 请使用继承的思想，设计 CommonEmployee 类和 Manager 类，要求类中提供必要的方法进行属性访问。
 */
public class EmployeeAbstract {
    public static void main(String[] args) {

        ManagerAbstract manager =new ManagerAbstract("xiaoming",1001,8000,10000);
        manager.work();
        CommenEmployeeAbstract commenEmployee = new CommenEmployeeAbstract();
        commenEmployee.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}
