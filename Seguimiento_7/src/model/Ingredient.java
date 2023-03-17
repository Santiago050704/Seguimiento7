package model;

public class Ingredient {
    private String name;
    private double weight;

    public Ingredient(){

    }

    public void addWeight(double weight){
        this.weight += weight;
    }

    public void removeWeight(){
        this.weight = 0;
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
