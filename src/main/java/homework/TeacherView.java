package homework;

import java.util.List;

public class TeacherView {
    public <T extends Teacher> void sendOnConsole(List<T> teachers) {
        for (T teacher : teachers) {
            System.out.println(teacher);
        }
    }
}

