package com.iron.avn.data.players;

/**
 * Created by Tom on 9/12/16.
 */
public abstract class Player {

    // make private and use a getter or setter methods later
    private int health;
    private String userName;

    // method on parent class to display string? confused
    public String toString(){
        return getType();
    }
    //abtraction
    private  String type;

    // right click -> generate -> getting and setter
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    // made abstract so that when class is extend you must define this method
    public abstract String getType();

      // remove set so no one else could set it
    //public void setType(String type) {
    // this.type = type;
    // }
}

