package test06.Exer;

public class ManagerAbstract extends Employee {
    private double bonus;

    public ManagerAbstract(double bonus) {
        this.bonus = bonus;
    }

    public ManagerAbstract(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("maneger working");
    }

}
