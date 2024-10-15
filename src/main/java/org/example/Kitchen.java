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

    //Once we can check the remaining number of orders
    //Once we can add foods to the list of orders
    //Then we have to be able to remove orders that are done
    public void remove(Food food){
        orders.remove(food); // This will remove from the list
    }

    //We are going to serve the next meal for the customer
    //And once the meal is served we removed that meal from the list
    public Food serveNextMeal(){
        //The meal will contain
        //The meal type
        for(Courses course : Courses.values()){ // Starter
            //For each of the enum course types
            //We check the values

            for(Food food : orders){ // Pancakes
                //for every food we serve from the food orders
                //We check the type of the food
                if (food.getType() == course){ //If pancakes is a STARTER
                    orders.remove(food);
                    return food;

                }

                //this way whe chef works through a list of foods
                //Starting from the Starters, moving towards the main then desserts


            }

        }

    }



}
