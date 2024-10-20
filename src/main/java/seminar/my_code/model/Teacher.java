package seminar.my_code.model;

public class Teacher extends User {
    private int teacherId;
    private String subject;

    public Teacher(String firstName, String lastName, int birthYear, int teacherId, String subject) {
        super(firstName, lastName, birthYear);
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "teacherId=" + teacherId +
               ", subject='" + subject + '\'' +
               ", firstName='" + getFirstName() + '\'' +
               ", lastName='" + getLastName() + '\'' +
               ", birthYear=" + getBirthYear() +
               '}';
    }
}

