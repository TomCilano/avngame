package com.iron.avn.data.weapons;

/**
 * Created by Tom on 9/12/16.
 */
public abstract class Weapon {
    public abstract String getWepType();
    String wepType;

    public String toString(){

        return getWepType();
    }



}
