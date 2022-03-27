package com.mindera.mindswap;

public class Table {

    private boolean free;
    private String order;

    public Table() {
        free = true;
        order = null;
    }

    public void occupy() {
        free = false;
    }

    public void unoccupy() {
        free = true;
    }

   public void cleanOrder(){
        order = null;
   }

    public void saveOrder(String order) {
        if (this.order != null) {
            return;
        }

        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public boolean isFree() {
        return free;
    }
}
