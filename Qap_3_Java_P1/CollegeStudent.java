// CollegeStudent.java
public class CollegeStudent extends Student {
    private int myYear;    // College year (1, 2, 3, 4, etc.)
    private String myMajor;

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        myYear = year;
        myMajor = major;
    }

    // Getter and Setter Methods
    public int getYear() {
        return myYear;
    }

    public void setYear(int year) {
        myYear = year;
    }

    public String getMajor() {
        return myMajor;
    }

    public void setMajor(String major) {
        myMajor = major;
    }

    // toString Method
    public String toString() {
        return super.toString() + ", Year: " + myYear + ", Major: " + myMajor;
    }
}
