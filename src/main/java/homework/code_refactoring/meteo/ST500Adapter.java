package homework.code_refactoring.meteo;

import java.time.*;

public class ST500Adapter implements MeteoSensor {
    private final SensorTemperature sensor;

    public ST500Adapter(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        // Значение отсутствует в исходном интерфейсе, возвращаем null
        return null;
    }

    @Override
    public Float getPressure() {
        // Значение отсутствует в исходном интерфейсе, возвращаем null
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensor.year(), 1, 1, 0, 0)
                .plusDays(sensor.day() - 1)
                .plusSeconds(sensor.second());
    }
}

