package homework.code_refactoring.jobagency;

// Интерфейс для рассылки предложений наблюдателям
public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void sendOffer(String nameCompany, int salary);
}