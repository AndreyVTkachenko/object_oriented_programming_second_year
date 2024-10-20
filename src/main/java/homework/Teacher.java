package homework;

import seminar.my_code.data.User;

public class Teacher extends User {
    private String subject;

    public Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
               "firstName='" + getFirstName() + '\'' +
               ", lastName='" + getLastName() + '\'' +
               ", subject='" + subject + '\'' +
               '}';
    }
}

