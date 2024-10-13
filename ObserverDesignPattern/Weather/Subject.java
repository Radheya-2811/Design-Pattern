package ObserverDesignPattern.Weather;

 interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}

