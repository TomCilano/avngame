package com.iron.avn.service;

import com.iron.avn.data.weapons.Weapon;
import com.iron.avn.data.weapons.laser;
import com.iron.avn.data.weapons.sword;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/12/16.
 */
public class weaponService {

    public List<Weapon> getAllWeapons(){
        List<Weapon> allWeapons = new ArrayList<>();
        allWeapons.add(new laser());
        allWeapons.add(new sword());
        return allWeapons;
    }

}
