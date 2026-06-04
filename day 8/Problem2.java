class Employee {
    String name;
    static String company = "TCS";

    Employee(String name) {
        this.name = name;
    }

    double salary() {
        return 30000;
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    double salary() {
        return 60000;
    }
}

public class Problem2{
    public static void main(String[] args) {
        Employee e = new Manager("Ravi");
        System.out.println(e.name + " " + e.salary());
    }
}