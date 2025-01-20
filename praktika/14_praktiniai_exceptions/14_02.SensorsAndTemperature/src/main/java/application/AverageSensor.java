package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements  Sensor{
    private boolean isOn;
    private ArrayList<Sensor> sensors = new ArrayList<>();

    public AverageSensor() {
        isOn = false;
    }

    public boolean CheckStatus() {
        int validateAmount = sensors.size();
        int validatedAmount = 0;

        for (Sensor sensor : sensors) {
            if (sensor.isOn()) {
                validatedAmount++;
            }
        }

//        System.out.println(validatedAmount == validateAmount);

        return validatedAmount == validateAmount;
    }

    public void addSensor (Sensor toAdd) {
        sensors.add(toAdd);

        isOn = CheckStatus();
    }

    public List<Integer> readings() {
        List<Integer> result = new ArrayList<>();

        for (Sensor s : sensors) {
            result.add(s.read());
        }

        return result;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }

        isOn = true;
    }

    @Override
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }

        isOn = false;
    }

    @Override
    public int read() {
        if (!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException();
        }

        int numSum = 0;

        for (Sensor s : sensors) {
            numSum += s.read();
        }

        return numSum/sensors.size();
    }
}
