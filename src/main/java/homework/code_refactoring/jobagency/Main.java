package homework.code_refactoring.jobagency;

public class Main {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);

        Observer petrov = new Student("Petrov");
        Observer ivanov = new Master("Ivanov");

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);

        for (int i = 0; i < 10; i++) {
            google.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
