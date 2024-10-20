package seminar.my_code.controller;

import seminar.my_code.model.Student;
import seminar.my_code.service.DataService;
import seminar.my_code.view.StudentView;

import java.util.List;

public class Controller {

    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String lastName, int birthYear) {

        dataService.createStudent(firstName, lastName, birthYear);

        List<Student> students = dataService.getAllStudents();

        for (Student student : students) {
            studentView.sendOnConsole(student);
        }
    }
}

