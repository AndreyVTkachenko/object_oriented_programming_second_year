package seminar.my_code;

import java.util.Collections;
import java.util.List;

public class StudyGroupService {

    public void removeStudentByFullName(StudyGroup group, String firstName, String lastName) {
        StudyGroupIterator iterator = group.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                iterator.remove();
                break;
            }
        }
    }

    public void sortStudentsById(StudyGroup group) {
        Collections.sort(group.getStudents());
    }

    public void sortStudentsByFullName(StudyGroup group) {
        List<Student> students = group.getStudents();
        students.sort(new StudentComparator());
    }
}