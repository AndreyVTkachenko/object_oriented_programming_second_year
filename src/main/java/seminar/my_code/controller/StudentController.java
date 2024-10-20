package seminar.my_code.controller;

import seminar.my_code.data.Student;
import seminar.my_code.view.StudentView;
import seminar.my_code.data.StudyGroup;
import seminar.my_code.service.StudyGroupService;

public class StudentController implements UserController<Student> {
    private final StudyGroupService service;
    private final StudentView studentView;

    public StudentController(StudyGroupService service, StudentView studentView) {
        this.service = service;
        this.studentView = studentView;
    }

    @Override
    public void create(Student student) {
        // Не вижу смысла в реализации логики создания студента. Просто выводим сообщение о его создании
        System.out.println("Создан студент: " + student);
    }

    public void sortStudents(StudyGroup group) {
        service.sortStudentsById(group);
        studentView.sendOnConsole(group.getStudents());
    }

    public void sortStudentsByFullName(StudyGroup group) {
        service.sortStudentsByFullName(group);
        studentView.sendOnConsole(group.getStudents());
    }
}

