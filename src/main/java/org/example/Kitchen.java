package org.example;

import java.util.ArrayList;

public class Kitchen {
    //This is the kitchen
    //The food will be served from here

    //We need to capture the number of food we are preparing
    //Collection of the foods

    private ArrayList<Food> orders = new ArrayList<>();
    //We want to know how many orders we have

    public int numRemainingOrders(){
        //return the size of the array list, which in theory should be the number of orders we have
        return orders.size();
    }

    //Create a method to populate the collection of orders
    //Take in the orders
    public void add(Food food){
        //Check the allergens
        //By making the food an instance of the interface
        //Print all the allergens that exist in the food
        //From the enums



        //Since we are working with an arrayList we can use the add method
        orders.add(food);
        System.out.println("added : " + food.getName());
        //Now we need to create the logic to check for allergens
        //Since the allergens are inherent to the food ingredients
        //In order for us to check the allergens we can check
        //which instance of the allergens is this particular food in

        if(food instanceof Allergic){
            //The check here is through the list of allergens which is abstracted from the interface
            System.out.println("Warning this order contains the following allergens: " );
            //List out all the allergens in the food

            //The allergens are going to be stored in the list of allergens in the interface
            //The food will contain the allergens in the ingredients
            //Turn the food into an instance of the interface allergic
            //To list out the allergens through the abstracted method
            Allergens[] allergens = ((Allergic) food).listAllergens();

            //Print out all the allergens in that food
            //By listing them from the enums
            for(Allergens allergen : allergens){
                //List out all allergens from the enums
                System.out.println(allergen);
            }

        }
    }


}
