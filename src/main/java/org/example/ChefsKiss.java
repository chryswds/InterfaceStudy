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


    }

}
