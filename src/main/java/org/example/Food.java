package org.example;

public class Food {

    //This is an abstract class that will contain the food logic

    //The attributes for food are as follows
    //A price and a course type


    private String name;
    private double price;
    private Courses type;


    //The next thing is that these food will be prepared in a kitchen
    //Therefore we need to have a kitchen attribute to see which kitchen it will be prepared from

    private static Kitchen kitchen;

    //Set the kitchen that the food is being made out of

    public static void setKitchen(Kitchen newKitchen){
        kitchen = newKitchen;
    }

    // The constructor will take in the information from the user and add them to the list of foods


    public Food(String name, double price, Courses type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }


    //Create some getters and setters

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public Courses getType() {
        return type;
    }



    //Take the order from the user

}
