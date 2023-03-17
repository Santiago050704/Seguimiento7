package model;

import exceptions.NegativeNumberEntryException;

public class Ingredient {
    private String name;
    private double weight;

    public Ingredient(){

    }

    public void addWeight(double weight) throws Exception{
        if(weight < 0) throw new NegativeNumberEntryException();
        this.weight += weight;
    }

    public void removeWeight(double n) throws Exception{
        if(n < 0) throw new NegativeNumberEntryException();
        this.weight -= n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
