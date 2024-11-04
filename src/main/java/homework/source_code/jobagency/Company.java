package homework.source_code.jobagency;

import java.util.Random;

// Это компания, которая нуждается в сотрудниках, она будет давать команду агентству
public class Company {
    Publisher jobAgency;
    String nameCompany;
    Random rnd;
    int maxSalary;

    // компания работает с определенным агентством
    public Company(Publisher jobAgency, String nameCompany, int maxSalary){
        this.jobAgency = jobAgency;
        this.nameCompany = nameCompany;
        rnd = new Random();
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = rnd.nextInt(maxSalary);
        jobAgency.sendOffer(nameCompany, salary);
    }
}
