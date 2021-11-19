package com.michael_leal.myapplication;

public class Sensores {
    private String nameSensor;
    private String valuesensor;
    public Sensores(String nameSensor, String valuesensor) {
        this.nameSensor = nameSensor;
        this.valuesensor = valuesensor;
    }

    public Sensores(){
    }

    public String getNameSensor() {
        return nameSensor;
    }

    public void setNameSensor(String nameSensor) {
        this.nameSensor = nameSensor;
    }

    public String getValuesensor() {
        return valuesensor;
    }

    public void setValuesensor(String valuesensor) {
        this.valuesensor = valuesensor;
    }


}
