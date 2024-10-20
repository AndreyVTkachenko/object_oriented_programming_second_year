package seminar.my_code;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int firstNameComparison = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        return s1.getLastName().compareTo(s2.getLastName());
    }
}
