package org.example.designPattern.observer;

public class CurrentConditionDisplay implements Observer{

    private float temperature;
    private float pression;
    private float humidite;



    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }



    public void setPression(float pression) {
        this.pression = pression;
    }



    public void setHumidite(float humidite) {
        this.humidite = humidite;
    }

    @Override
    public void update(float temperature, float pression, float humidite) {
        this.humidite = humidite;
        this.pression = pression;
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("Current temperature " + temperature + " F degrees et " + humidite + " % humidité" );
    }


}
