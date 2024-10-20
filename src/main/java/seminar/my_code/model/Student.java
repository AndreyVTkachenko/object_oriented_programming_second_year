package seminar.my_code.model;

public class Student extends User {
    private int studentId;

    public Student(String firstName, String lastName, int birthYear, int studentId) {
        super(firstName, lastName, birthYear);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
               "studentId=" + studentId +
               ", firstName='" + getFirstName() + '\'' +
               ", lastName='" + getLastName() + '\'' +
               ", birthYear=" + getBirthYear() +
               '}';
    }
}

