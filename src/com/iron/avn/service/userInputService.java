package com.iron.avn.service;

import com.iron.avn.data.players.Player;

import java.util.List;
import java.util.Scanner;

/**
 * Created by Tom on 9/12/16.
 */
public class userInputService {
    public Player choosePlayer(List<Player> allPlayers){
        Player playerOne = null;
        System.out.println("Please select player type.");
        System.out.println(allPlayers);

        Scanner input = new Scanner(System.in);

        // this loop continues asking until parameters are met.
        while (playerOne == null)
        {
            String userChoseThis = input.nextLine();
            for (Player tmp : allPlayers)
            {
                if (userChoseThis.equalsIgnoreCase(tmp.getType()))
                {
                    playerOne = tmp;
                }
            }
            if (playerOne == null) {
                System.out.println("Choose a proper type");
            }

        }
        return playerOne;
    }
}
