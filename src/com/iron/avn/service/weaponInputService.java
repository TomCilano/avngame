package com.iron.avn.service;

import com.iron.avn.data.weapons.Weapon;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Tom on 9/12/16.
 */
public class weaponInputService {
    public Weapon chooseWeapon(List<Weapon> allWeapons){
        Weapon weaponChoice = null;
        System.out.println("Please choose a weapon!");
        System.out.println(allWeapons);

        Scanner input = new Scanner(System.in);
        while (weaponChoice == null)

        {
            String userChoseThis = input.nextLine();
            for (Weapon tmp : allWeapons)
            {
                if (userChoseThis.equalsIgnoreCase(tmp.getWepType()))
                {
                    weaponChoice = tmp;
                }
            }
            if (weaponChoice == null)
            {
                System.out.println("Choose a proper type");
            }
        }
        return weaponChoice;
    }
}
