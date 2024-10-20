package seminar.my_code.controller;

import seminar.my_code.data.StudyGroup;
import seminar.my_code.service.StudyGroupService;

public class StudyGroupController {
    private final StudyGroupService service;

    public StudyGroupController(StudyGroupService service) {
        this.service = service;
    }

    public void removeStudent(StudyGroup group, String firstName, String lastName) {
        service.removeStudentByFullName(group, firstName, lastName);
    }

    public void sortStudents(StudyGroup group) {
        service.sortStudentsById(group);
    }

    public void sortStudentsByFullName(StudyGroup group) {
        service.sortStudentsByFullName(group);
    }
}
