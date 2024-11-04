package homework.code_refactoring.jobagency;

// Наблюдатель, получает уведомления о новых предложениях
public interface Observer {
    void receiveOffer(String nameCompany, int salary);
}
