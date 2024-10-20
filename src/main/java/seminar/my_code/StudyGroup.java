package seminar.my_code;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> students;

    public StudyGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public StudyGroupIterator iterator() {
        return new StudyGroupIterator(this);
    }
}
