package org.example;

public class GarlicCheeseBread extends Food implements Allergic{

    private final Allergens[] ALLERGENS = {Allergens.DAIRY, Allergens.GLUTEN};

    //Create the constructor to pass in the information of the food

    public GarlicCheeseBread(){
        super("Garlic Cheese Bread", 6.0, Courses.STARTER);
    }

    @Override
    public Allergens[] listAllergens(){
        return ALLERGENS;
    }
}
