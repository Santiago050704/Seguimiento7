package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {



    private Recipe recipe;


    public void setup1(){
        recipe = new Recipe();

    }

    public void setup2(){
        recipe = new Recipe();
        Ingredient ingredient1 = new Ingredient();
        Ingredient ingredient2 = new Ingredient();
        Ingredient ingredient3 = new Ingredient();
        ingredient1.setName("Cebolla");
        ingredient1.setWeight(315);
        ingredient2.setName("Ajo");
        ingredient2.setWeight(58);
        ingredient3.setName("Arroz");
        ingredient3.setWeight(520);
        recipe.addIngredient(ingredient1);
        recipe.addIngredient(ingredient2);
        recipe.addIngredient(ingredient3);
    }

    @Test
    public void addIngredientTest(){
        setup1();
        Ingredient ingredient = new Ingredient();
        ingredient.setName("Sal");
        ingredient.setWeight(12);
        recipe.addIngredient(ingredient);
        assertEquals(recipe.getIngredients().get(0).getName(), "Sal");
    }

    @Test
    public void addIngredientTest2(){
        setup2();
        Ingredient ingredient = new Ingredient();
        ingredient.setName("Pimienta");
        ingredient.setWeight(6);

        recipe.addIngredient(ingredient);

        assertEquals(recipe.getIngredients().get(3).getName(), "Pimienta");
        assertEquals(recipe.getIngredients().get(1).getName(), "Ajo");
    }

    @Test
    public void addIngredientTest3(){
        setup2();
        Ingredient ingredient = new Ingredient();
        ingredient.setName("Ajo");
        ingredient.setWeight(21);
        recipe.addIngredient(ingredient);
        assertEquals(recipe.getIngredients().get(1).getName(), "Ajo");
    }

    @Test
    public void removeIngredientTest(){
        setup2();
        recipe.removeIngredient("Ajo");
        assertEquals(2, recipe.getIngredients().size());
        assertNotEquals(recipe.getIngredients().get(0).getName(), "Ajo");
        assertNotEquals(recipe.getIngredients().get(1).getName(), "Ajo");
    }
}
