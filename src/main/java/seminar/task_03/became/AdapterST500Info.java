package seminar.task_03.became;

import java.time.LocalDateTime;

public class AdapterST500Info implements MeteoSensor{

    private SensorTemperature adapter;

    public AdapterST500Info(SensorTemperature adapter) {
        this.adapter = adapter;
    }

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return 0f;
    }

    @Override
    public Float getPressure() {
        return 0f;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime date = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        date = date.plusDays(adapter.day() - 1);
        date = date.plusDays(adapter.second());
        return date;
    }
}
