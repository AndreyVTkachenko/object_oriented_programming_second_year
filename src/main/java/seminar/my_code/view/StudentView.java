package seminar.my_code.view;

import seminar.my_code.data.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
