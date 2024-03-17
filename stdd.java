class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Student object
        Student student = new Student("John Doe");

        // Display Student Name
        student.displayName();
    }
}
