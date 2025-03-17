// Teacher.java
public class Teacher extends Person {
    private String mySubject; // Subject taught
    private double mySalary;  // Salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getter and Setter Methods
    public String getSubject() {
        return mySubject;
    }

    public void setSubject(String subject) {
        mySubject = subject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: $" + mySalary;
    }
}
