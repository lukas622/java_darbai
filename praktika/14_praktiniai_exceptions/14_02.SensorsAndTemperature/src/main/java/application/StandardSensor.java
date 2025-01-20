package application;

public class StandardSensor implements Sensor {
    private int number;
    private boolean isOn;

    public StandardSensor(int num) {
        number = num;
        isOn = true;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return number;
    }
}
