package homework;

import homework.controller.Controller;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("Иван", "Иванов", "Иванович");
        controller.createStudent("Петр", "Петров", "Петрович");
        controller.createStudent("Мария", "Иванова", "Петровна");

        controller.createTeacher("Сергей", "Сергеев", "Сергеевич");

        System.out.println("Список студентов:");
        controller.getAllStudent();

        List<Integer> studentIds = Arrays.asList(1, 2, 3);
        controller.createStudyGroup(1, studentIds);
    }
}
