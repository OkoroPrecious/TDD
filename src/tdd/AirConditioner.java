package tdd;

public class AirConditioner {
    private int temperature;
    private boolean isOn;

    public void setOn(boolean working) {
       isOn = working;
    }

    public boolean getOnValue() {
        return isOn;
    }

    public void setTemperature(int temp) {
            temperature = temp;
    }

    public int getTemperature() {
        return temperature;

    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 30){
            temperature++;
        }
    }

    public void decreaseTemperature() {
        if (temperature > 16 && temperature < 30){
            temperature--;
        }
    }
}
