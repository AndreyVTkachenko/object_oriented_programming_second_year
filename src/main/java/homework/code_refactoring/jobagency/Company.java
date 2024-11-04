package homework.code_refactoring.jobagency;

public class Company {
    private final Publisher jobAgency;
    private final String nameCompany;
    private final SalaryGenerator salaryGenerator;
    private final int maxSalary;

    public Company(Publisher jobAgency, String nameCompany, int maxSalary) {
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.salaryGenerator = new SalaryGenerator();
    }

    public void needEmployee() {
        int salary = salaryGenerator.generate(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
