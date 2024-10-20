package seminar.my_code;

import seminar.my_code.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("Иван", "Иванов", 2000);
        controller.createStudent("Мария", "Петрова", 1999);
        controller.createStudent("Петр", "Сидоров", 2001);
    }
}

