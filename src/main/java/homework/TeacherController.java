package homework;

public class TeacherController {
    private final TeacherService service;
    private final TeacherView teacherView;

    public TeacherController(TeacherService service, TeacherView teacherView) {
        this.service = service;
        this.teacherView = teacherView;
    }

    public void create(Teacher teacher) {
        service.addTeacher(teacher);
        System.out.println("Создан учитель: " + teacher);
    }

    public void editTeacher(int index, Teacher teacher) {
        service.editTeacher(index, teacher);
        System.out.println("Учитель обновлен: " + teacher);
    }

    public void displayTeachers() {
        System.out.println("Список учителей:");
        teacherView.sendOnConsole(service.getTeachers());
    }
}

