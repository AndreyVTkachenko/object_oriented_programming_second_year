package seminar.my_code.data;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudyGroupIterator implements Iterator<Student> {
    private final List<Student> students;
    private int position = 0;

    public StudyGroupIterator(StudyGroup group) {
        this.students = group.getStudents();
    }

    @Override
    public boolean hasNext() {
        return position < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            throw new NoSuchElementException("В группе больше нет студентов.");
        }
        return students.get(position++);
    }

    @Override
    public void remove() {
        if (position == 0) {
            throw new IllegalStateException("Вызовите next() перед вызовом remove().");
        }
        students.remove(--position);
    }
}
