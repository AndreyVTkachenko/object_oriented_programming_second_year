package seminar.my_code.service;

import seminar.my_code.model.Student;
import seminar.my_code.model.Teacher;
import seminar.my_code.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public void createStudent(String firstName, String lastName, int birthYear) {
        int studentId = generateNewStudentId();
        Student student = new Student(firstName, lastName, birthYear, studentId);
        users.add(student);
    }

    public void createTeacher(String firstName, String lastName, int birthYear, String subject) {
        int teacherId = generateNewTeacherId();
        Teacher teacher = new Teacher(firstName, lastName, birthYear, teacherId, subject);
        users.add(teacher);
    }

    public List<User> readAllUsers() {
        return users;
    }

    private int generateNewStudentId() {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Student) {
                int currentId = ((Student) user).getStudentId();
                if (currentId > maxId) {
                    maxId = currentId;
                }
            }
        }
        return maxId + 1;
    }

    private int generateNewTeacherId() {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Teacher) {
                int currentId = ((Teacher) user).getTeacherId();
                if (currentId > maxId) {
                    maxId = currentId;
                }
            }
        }
        return maxId + 1;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }
}

