
// +---------------------+
// |     Employee        |
// +---------------------+
// | -id: int            |
// | -name: string       |
// | -salary: double     |
// +---------------------+
// | +getDetails(): void |
// +---------------------+

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void getDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// +--------+        +--------+
// | Person |        |  Book  |
// +--------+        +--------+
// | - name |        | - title|
// | - age  |        | - author|
// +--------+        +--------+

public class Person {
    private String name;
    private int age;

    // Person constructor and getters/setters for name and age
}

public class Book {
    private String title;
    private String author;

    // Book constructor and getters/setters for title and author
}

// +------------------+        +------------------+
// |     Rectangle    |        |      Triangle    |
// +------------------+        +------------------+
// |  width : double  |        |  base : double    |
// |  height : double |        |  height : double  |
// +------------------+        +------------------+
// |  getArea()       |        |  getArea()        |
// +------------------+        +------------------+

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

// +-----------------+       +----------------+
// |    BankAccount   |       |    Customer    |
// +-----------------+       +----------------+
// | -accountNumber   |       | -firstName    |
// | -balance         |       | -lastName     |
// +-----------------+       +----------------+
// | +deposit(amount) |       | +getFullName() |
// | +withdraw(amount)|       +----------------+
// | +getBalance()    |
// +-----------------+

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Customer {
    private String firstName;
    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

// +---------------+       +-----------------+
// |    Employee   |       |    Department   |
// +---------------+       +-----------------+
// | -firstName    |       | -name           |
// | -lastName     |       | -managerName    |
// | -employeeID   |       +-----------------+
// | -position     |
// +---------------+
// | +calculateSalary() |
// +---------------+
public class Employee {
    private String firstName;
    private String lastName;
    private int employeeID;
    private String position;

    public Employee(String firstName, String lastName, int employeeID, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.position = position;
    }

    public double calculateSalary() {
        // Calculation based on employee's position and other factors
        return 0.0;
    }
}

public class Department {
    private String name;
    private String managerName;

    public Department(String name, String managerName) {
        this.name = name;
        this.managerName = managerName;
    }
}


