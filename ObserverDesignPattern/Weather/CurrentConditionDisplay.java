package ObserverDesignPattern.Weather;

public class CurrentConditionDisplay implements Observer,DisplayElement {
    float humidity,pressure,temperature;
    Subject weatherData;
    CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
    public void display(){
        System.out.println("Temprature= "+temperature);
        System.out.println("Humidity = "+humidity);
        System.out.println("Pressure = "+pressure);
    }
}
