package seminar.my_code;

public class Main {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();
        group.addStudent(new Student("Иван", "Иванов", 3));
        group.addStudent(new Student("Мария", "Петрова", 1));
        group.addStudent(new Student("Петр", "Сидоров", 2));
        group.addStudent(new Student("Глеб", "Решетов", 4));

        StudyGroupService service = new StudyGroupService();
        StudyGroupController controller = new StudyGroupController(service);

        System.out.println("До сортировки по ФИО:");
        for (Student student : group) {
            System.out.println(student);
        }

        controller.sortStudentsByFullName(group);

        System.out.println("После сортировки по ФИО:");
        for (Student student : group) {
            System.out.println(student);
        }
    }
}
