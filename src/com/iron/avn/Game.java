package com.iron.avn;

import com.iron.avn.data.players.Player;
import com.iron.avn.data.weapons.Weapon;
import com.iron.avn.service.PlayerService;
import com.iron.avn.service.userInputService;
import com.iron.avn.service.weaponInputService;
import com.iron.avn.service.weaponService;

import java.util.List;


/**
 * Created by Tom on 9/12/16.
 */
public class Game {
    /**
     * This is how you run the game fun right?
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Welcome to my game");
        System.out.println("rules go here");

        // player selection
        Player playerOne = null;
        Weapon playerWep = null;

        //create services
        userInputService uiService = new userInputService();

        PlayerService pService = new PlayerService();

        pService.getAllPlayers();

        List<Player> allPlayers = pService.getAllPlayers();

        weaponService wService = new weaponService();

        weaponInputService wiService = new weaponInputService();
        wService.getAllWeapons();

        List<Weapon> allWeapons = wService.getAllWeapons();

        playerOne = uiService.choosePlayer(allPlayers);

        playerWep = wiService.chooseWeapon(allWeapons);

        //   if you don;t call a method on th variable get type it will come back with null. otherwise exception.
        System.out.println("Congratulations you are a " + playerOne.getType());
        System.out.println("your have choose a " + playerWep.getWepType());


    }


}
