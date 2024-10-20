package homework.service;

import homework.model.Student;
import homework.model.Teacher;
import homework.model.StudyGroup;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}

