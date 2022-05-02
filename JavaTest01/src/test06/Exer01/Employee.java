package test06.Exer01;

/**
 * 编写
 * 工资系统 实现不同类型员工 多态 的按月发放工资 。 如果当月出现某个Employee 对象的生日 则将该雇员的工资增加 100 元 。
 * 实验说明：
 * （1）定义一个 Employee 类，该类包含：private成员变量 name,number,birthday ，其中 birthday 为 MyDate 类的对象；
 * abstract方法 earnings()
 * toString方法输出对象的 name,number 和 birthday 。
 */
public abstract class Employee {
    private String name;
    private int number;
    private Mydate birthday;

    public Employee(String name, int number, Mydate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Mydate getBirthday() {
        return birthday;
    }

    public void setBirthday(Mydate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
