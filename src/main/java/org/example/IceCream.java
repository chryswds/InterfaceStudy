package org.example;
//the first thing to do to make this food available and functional with our system


public class IceCream extends Food implements Allergic {

    //Add the allergens for the icecream so that i cant change
    private final Allergens[] ALLERGENS = {Allergens.DAIRY};

    //icecream is a food, from Food class foods have name price type
    IceCream(){
        //The information for this food is passed in here
        //Super sends the information to the parent to make it accessible to the other classes that read information from the parent
        super("Ice Cream", 4.5, Courses.DESSERT);
    }
    //Override to get rid of the error
    @Override
    public Allergens[] listAllergens(){
        //This will return a list of allergens
        //[DAIRY]
        return ALLERGENS;
    }
}
