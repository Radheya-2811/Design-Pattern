package ObserverDesignPattern.Weather;

public class Main {
    public static void main(String[] args) {
        WeatherData wd=new WeatherData();
        CurrentConditionDisplay cd=new CurrentConditionDisplay(wd);
        wd.setMeasurment(50, 5, 41);
    }
}
