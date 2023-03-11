
// +---------------------+
// |     Employee        |
// +---------------------+
// | -id: int            |
// | -name: string       |
// | -salary: double     |
// +---------------------+
// | +getDetails(): void |
// +---------------------+
class Employee {
    private int id;
    private String name;
    private double salary;

    public void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void getDetails() {
    System.out.println("ID="+id);
    System.out.println("NAME"+name);
    System.out.println("SALARY"+ salary);

}
}
public class UMLe {
    public static void main(String[] args) {
        Employee sh = new Employee();
        sh.setDetails(1112,"shoaibs",243.45);
        // System.out.println(sh.getName());
        sh.getDetails();

    }

}
