package ObserverDesignPattern.Weather;
import java.util.*;

public class WeatherData implements Subject {
    List<Observer> observers;
    float temperature;
    float humidity;
    float pressure;
    WeatherData(){
        observers=new ArrayList<>();
    }
   
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void setMeasurment(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurmentChanged();
    }
    public void notifyObserver(){
        for(Observer o:observers){
            o.update(temperature, humidity, pressure);
        }

    }
    public void measurmentChanged(){
        notifyObserver();
    }
    public float getHumidity() {
        return humidity;
    }
    public float getTemprature() {
        return temperature;
    }
    public float getPressure() {
        return pressure;
    }

}
