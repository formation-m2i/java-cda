package org.example.designPattern.observer;

public class ObserverDemo {


    public static void main() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        CurrentConditionDisplay currentConditionDisplay2 = new CurrentConditionDisplay();
        CurrentConditionDisplay currentConditionDisplay3 = new CurrentConditionDisplay();
        weatherData.addObserver(currentConditionDisplay);
        weatherData.addObserver(currentConditionDisplay2);
        currentConditionDisplay3.setHumidite(800);
        currentConditionDisplay3.setPression(200);
        currentConditionDisplay3.setTemperature(25);
        weatherData.setMesure(700,2.5f,5.4f);
        currentConditionDisplay3.display();


    }
}
