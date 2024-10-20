package homework.controller;

import homework.model.*;
import homework.service.DataService;
import homework.service.StudyGroupService;
import homework.view.StudentView;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.TEACHER);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public void createStudyGroup(int teacherId, List<Integer> studentIds) {
        Teacher teacher = (Teacher) service.getUserById(Type.TEACHER, teacherId);
        List<Student> students = studentIds.stream()
                .map(id -> (Student) service.getUserById(Type.STUDENT, id))
                .collect(Collectors.toList());;

        StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher, students);
        System.out.println(studyGroup);
    }
}
