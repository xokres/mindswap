package com.mindera.mindswap;

public class Client {

    private Restaurant restaurant;
    private int tableNumber = -1;


    public void askForTable() {
        if (checkRestaurantPresence() && tableNumber == -1) {
            tableNumber = restaurant.findTable();
            return;
        }
        System.out.println("I already have a table!");
    }

    public void pay() {
        if (checkRestaurantPresence()){
            tableNumber = restaurant.freeTable(tableNumber);
        }
      //  restaurant = null;
    }

    public void order(String dish) {
        if (checkRestaurantPresence()) {
            restaurant.receiveOrder(tableNumber, dish);
        }
    }

    private boolean checkRestaurantPresence() {
        if (restaurant == null) {
            System.out.println("Oh wait... I need to go to a restaurant before I can do this...");
            return false;
        }
        return true;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


}
