package ObserverDesignPattern.Weather;
import java.util.*;

public class weatherData implements Subject {
    List<Observer> observers;
    float temprature;
    float humidity;
    float pressure;
    weatherData(){
        observers=new ArrayList<>();
    }
   
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void setMeasurment(float temprature,float humidity,float pressure){
        this.temprature=temprature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurmentChanged();
    }
    public void notifyObserver(){
        for(Observer o:observers){
            o.update(temprature, humidity, pressure);
        }

    }
    public void measurmentChanged(){
        notifyObserver();
    }
    public float getHumidity() {
        return humidity;
    }
    public float getTemprature() {
        return temprature;
    }
    public float getPressure() {
        return pressure;
    }

}
