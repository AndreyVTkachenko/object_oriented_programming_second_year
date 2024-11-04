package seminar.task_01.became;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
