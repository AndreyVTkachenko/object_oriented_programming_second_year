package homework;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void editTeacher(int index, Teacher teacher) {
        if (index >= 0 && index < teachers.size()) {
            teachers.set(index, teacher);
        }
    }
}

