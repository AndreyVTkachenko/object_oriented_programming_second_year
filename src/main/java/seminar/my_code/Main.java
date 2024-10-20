package seminar.my_code;

import seminar.my_code.controller.StudentController;
import seminar.my_code.data.Student;
import seminar.my_code.data.StudyGroup;
import seminar.my_code.view.StudentView;
import seminar.my_code.service.StudyGroupService;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup();
        group1.addStudent(new Student("Иван", "Иванов", 1));
        group1.addStudent(new Student("Алексей", "Смирнов", 2));
        group1.addStudent(new Student("Ольга", "Сидорова", 3));

        StudyGroup group2 = new StudyGroup();
        group2.addStudent(new Student("Мария", "Петрова", 4));
        group2.addStudent(new Student("Анна", "Кузнецова", 5));

        StudyGroupService service = new StudyGroupService();
        StudentView studentView = new StudentView();
        StudentController controller = new StudentController(service, studentView);

        // Создаем новых студентов и выводим информацию
        controller.create(new Student("Дмитрий", "Федоров", 6));
        controller.create(new Student("Светлана", "Лебедева", 7));

        System.out.println("Группа 1 до сортировки по ФИО:");
        studentView.sendOnConsole(group1.getStudents());

        controller.sortStudentsByFullName(group1);

        System.out.println("Группа 1 после сортировки по ФИО:");
        studentView.sendOnConsole(group1.getStudents());

        System.out.println("Группа 2 до сортировки по ФИО:");
        studentView.sendOnConsole(group2.getStudents());

        controller.sortStudentsByFullName(group2);

        System.out.println("Группа 2 после сортировки по ФИО:");
        studentView.sendOnConsole(group2.getStudents());
    }
}
