package project03.test.domain;

public class Printer implements Equipment {
    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }

    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
