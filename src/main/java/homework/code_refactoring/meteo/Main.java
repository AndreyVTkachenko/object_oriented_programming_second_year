package homework.code_refactoring.meteo;

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public class Main {
        public static void main(String[] args) {
            MeteoStore meteoDb = new MeteoStore();

            MeteoSensor ms200_1 = new MS200(1);
            meteoDb.save(ms200_1);

            ST500Info st500Info = new ST500Info();
            MeteoSensor adapter = new ST500Adapter(st500Info.getData());
            meteoDb.save(adapter);
        }
    }
        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
