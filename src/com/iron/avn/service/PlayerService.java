package com.iron.avn.service;

import com.iron.avn.data.players.Alien;
import com.iron.avn.data.players.Ninja;
import com.iron.avn.data.players.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 9/12/16.
 */
public class PlayerService {
    public List<Player> getAllPlayers(){
        List<Player> allOfThem = new ArrayList<>();
        allOfThem.add(new Ninja());
        allOfThem.add(new Alien());
        return allOfThem;
    }
}
