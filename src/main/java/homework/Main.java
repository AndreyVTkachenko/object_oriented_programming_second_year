package homework;

import seminar.my_code.Student;
import seminar.my_code.StudyGroup;
import seminar.my_code.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudyGroup group1 = new StudyGroup();
        group1.addStudent(new Student("Иван", "Иванов", 1));
        group1.addStudent(new Student("Мария", "Петрова", 2));

        StudyGroup group2 = new StudyGroup();
        group2.addStudent(new Student("Алексей", "Смирнов", 3));
        group2.addStudent(new Student("Екатерина", "Давыдова", 4));

        StudyGroup group3 = new StudyGroup();
        group3.addStudent(new Student("Сергей", "Федоров", 5));
        group3.addStudent(new Student("Петр", "Сидоров", 6));

        StudyGroup group4 = new StudyGroup();
        group4.addStudent(new Student("Ольга", "Соколова", 7));
        group4.addStudent(new Student("Дмитрий", "Кузнецов", 8));

        StudyGroup group5 = new StudyGroup();
        group5.addStudent(new Student("Анна", "Николаева", 9));
        group5.addStudent(new Student("Александр", "Романов", 10));

        StudyGroup group6 = new StudyGroup();
        group6.addStudent(new Student("Виктория", "Захарова", 11));
        group6.addStudent(new Student("Кирилл", "Морозов", 12));

        StudyGroup group7 = new StudyGroup();
        group7.addStudent(new Student("Елена", "Лебедева", 13));
        group7.addStudent(new Student("Максим", "Попов", 14));

        Stream stream1 = new Stream();
        stream1.addStudyGroup(group1);
        stream1.addStudyGroup(group2);
        stream1.addStudyGroup(group3);
        stream1.addStudyGroup(group4);
        stream1.addStudyGroup(group5);

        Stream stream2 = new Stream();
        stream2.addStudyGroup(group6);
        stream2.addStudyGroup(group7);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        StudyGroupService studyGroupService = new StudyGroupService();
        StreamService streamService = new StreamService();
        Controller controller = new Controller(studyGroupService, streamService);

        System.out.println("До сортировки потоков:");
        for (int i = 0; i < streams.size(); i++) {
            System.out.println("Поток " + (i + 1) + ": Количество групп: " + streams.get(i).getStudyGroups().size());
        }

        controller.sortStreams(streams);

        System.out.println("После сортировки потоков:");
        for (int i = 0; i < streams.size(); i++) {
            System.out.println("Поток " + (i + 1) + ": Количество групп: " + streams.get(i).getStudyGroups().size());
        }
    }
}
