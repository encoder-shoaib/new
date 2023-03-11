class Student {
    private String sName;
    private int sld;
    private String dept;

    public Student(String sName, int sld, String dept) {
        this.sName = sName;
        this.sld = sld;
        this.dept = dept;
    }

    public String getSName() {
        return sName;
    }

    public int getSld() {
        return sld;
    }

    public String getDept() {
        return dept;
    }
}

public class ExMA {
    public static void main(String[] args) {
        Student st = new Student("John Doe", 1234, "Computer Science");
        System.out.println("Name: " + st.getSName());
        System.out.println("ID: " + st.getSld());
        System.out.println("Department: " + st.getDept());
    }
}

