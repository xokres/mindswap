package com.mindera.mindswap;

public class Restaurant {

    private static int restaurantCount = 0;


    private Table[] tables;
    private boolean fullCapacity;
    private int numberOfOccupiedTables;

    public Restaurant(int numberOfTables) {
        this.tables = new Table[numberOfTables];
        this.fullCapacity = false;
        this.numberOfOccupiedTables = 0;
        Restaurant.restaurantCount++;
    }


    public static int getRestaurantCount() {
        return Restaurant.restaurantCount;
    }


    public int findTable() {

        int tableNumber = -1;

        if (this.fullCapacity) {
            System.out.println("We're full, sorry. Kindly go away.");
            return tableNumber;
        }

        for (int i = 0; i < tables.length; i++) {
            if (tables[i] == null) {
                tables[i] = new Table(); // lazy instantiation
            }

            if (tables[i].isFree()) {
                occupyTable(i);
                tableNumber = i;
                break;
            }
        }

        System.out.println("Welcome! Here's your table number: " + tableNumber);
        return tableNumber;
    }

    private void occupyTable(int index) {

        tables[index].occupy();
        numberOfOccupiedTables++;

        if (numberOfOccupiedTables == tables.length) {
            fullCapacity = true;
        }
    }

    public int freeTable(int tableNumber) {
        if (!checkIfTableCanBeFreed(tableNumber)) {
            return tableNumber;
        }

        tables[tableNumber].unoccupy();
        tables[tableNumber].cleanOrder();
        numberOfOccupiedTables--;
        fullCapacity = false;
        System.out.println("Don't forget to tip us on your way out!");
        return -1;
    }

    private boolean checkIfTableCanBeFreed(int tableNumber) {
        if (tableNumber == -1) {
            System.out.println("You don't even have a table... What are you doing?");
            return false;
        }

        if (tables[tableNumber].getOrder() == null) {
            System.out.println("Sorry, but you need to order before you leave.");
            return false;
        }

        return true;
    }

    public void receiveOrder(int tableNumber, String dish) {
        if(tableNumber == -1){
            System.out.println("You need a table before you can eat.");
            return;
        }

        if(tables[tableNumber].getOrder() != null){
            System.out.println("This table already has an order. You can't place a new one.");
            return;
        }

        tables[tableNumber].saveOrder(dish);
        System.out.println("Here's a hot plate of " + dish + "!");
    }
}
