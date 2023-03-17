package model;

import java.util.ArrayList;

public class Recipe {

    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    public Recipe(){

    }

    public void addIngredient(Ingredient ingredient){
        boolean wasAdded = false;
        for(int i = 0; i < ingredients.size() && !wasAdded; i++){
            if(ingredients.get(i) != null && ingredients.get(i).getName().equalsIgnoreCase(ingredient.getName())) {
                ingredients.get(i).setWeight(ingredient.getWeight());
                wasAdded = true;
                return;
            }
        }
        ingredients.add(ingredient);

    }

    public void removeIngredient(String name){
        boolean wasRemove = false;
        for(int i = 0; i < ingredients.size() && !wasRemove; i++){
            if(ingredients.get(i) != null && ingredients.get(i).getName().equalsIgnoreCase(name)){
                ingredients.remove(ingredients.get(i));
                wasRemove = true;
            }
        }
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
