package seminar.my_code.data;

public class Student extends User implements Comparable<Student> {
    private int studentId;

    public Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.studentId, other.studentId);
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", firstName='" + getFirstName() + "', lastName='" + getLastName() + "'}";
    }
}

