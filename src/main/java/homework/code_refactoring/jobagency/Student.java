package homework.code_refactoring.jobagency;

public class Student implements Observer {
    private final String name;
    private int salary;

    public Student(String name) {
        this.name = name;
        this.salary = 0;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary < salary) {
            System.out.println(String.format("Student %s: I need this work! (company, salary) = %s, %d", name, nameCompany, salary));
            this.salary = salary;
        } else {
            System.out.println(String.format("Student %s: I got better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
