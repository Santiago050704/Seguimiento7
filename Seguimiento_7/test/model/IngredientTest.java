package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    Ingredient ingredient;

    @BeforeEach
    public void setup(){
        ingredient = new Ingredient();
        ingredient.setName("Tomate");
        ingredient.setWeight(245);
    }
    @Test
    public void addWeightTest(){
        try{
            ingredient.addWeight(54);
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(ingredient.getWeight(), 299);

    }

    @Test
    public void addWeightTest2(){
        boolean result = false;
        try{
            ingredient.addWeight(-100);
            result = true;
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(ingredient.getWeight(), 245);
        assertFalse(result);
    }

    @Test
    public void removeWeightTest(){
        try{
            ingredient.removeWeight(45);
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals(ingredient.getWeight(), 200);
    }

    @Test
    public void removeWeightTest2(){
        boolean result = false;
        try{
            ingredient.removeWeight(-100);
            result = true;
        } catch (Exception e){
            e.printStackTrace();
        }
        assertFalse(result);
        assertEquals(ingredient.getWeight(), 245);
    }
}
