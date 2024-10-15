package org.example;

public class ChefsKiss {

    //Now the chef cna get to work
    //BY populating the kitchen will all the order and start working through them


    public static void main(String[] args){

        //Make a kitchen instance so the chef can keep track of all the orders

        Kitchen kitchen = new Kitchen();

        //The chef is now in the kitchen so we set this new kitchen as the current kitchen the chef is in

        Food.setKitchen(kitchen); //The chef can now work from this kitchen

        //Add the first meal
        kitchen.add(new VegSoup()); // Starter
        kitchen.add(new Chicken()); // Main
        kitchen.add(new IceCream()); // Dessert


        //Add 2nd meal

        kitchen.add(new GarlicCheeseBread());
        kitchen.add(new Chicken());
        kitchen.add(new IceCream());


        //The chef is going to iterate through the list of items
        //Check if order is part of the course type
        // If it is then the chef will prepare it
        //The chef will remove it from the list of pending orders
        //The chef will serve it to the waiter to take to the table

        while(kitchen.numRemainingOrders()> 0){
            // as long as the length of the arraylist is bigger than 0
            // We assume we have more orders to serve
            System.out.println(kitchen.serveNextMeal().getName());
        }




    }

}
