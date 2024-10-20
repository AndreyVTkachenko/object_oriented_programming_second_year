package seminar.my_code.view;

import seminar.my_code.model.Student;

public class StudentView {

    public void sendOnConsole(Student student) {
        System.out.println("Студент:");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Имя: " + student.getFirstName());
        System.out.println("Фамилия: " + student.getLastName());
        System.out.println("Год рождения: " + student.getBirthYear());
    }
}

