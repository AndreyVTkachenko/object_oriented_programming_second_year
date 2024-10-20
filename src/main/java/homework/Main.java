package homework;

import seminar.my_code.controller.StudentController;
import seminar.my_code.data.Student;
import seminar.my_code.data.StudyGroup;
import seminar.my_code.service.StudyGroupService;
import seminar.my_code.view.StudentView;

public class Main {
    public static void main(String[] args) {

        StudyGroup group1 = new StudyGroup();
        group1.addStudent(new Student("Иван", "Иванов", 1));
        group1.addStudent(new Student("Алексей", "Смирнов", 2));

        StudyGroupService studentService = new StudyGroupService();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentService, studentView);

        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        teacherController.create(new Teacher("Николай", "Петров", "Математика"));
        teacherController.create(new Teacher("Светлана", "Лебедева", "Физика"));

        teacherController.displayTeachers();

        teacherController.editTeacher(0, new Teacher("Николай", "Петров", "Математика, Информатика"));

        teacherController.displayTeachers();
    }
}

