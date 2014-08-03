/*
 * Author: 598Johnn897
 * 
 * Date: Jul 31, 2014
 * Package: com.jkush321.autowalls.team
 *
 */
package com.jkush321.autowalls.team;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created: Jul 31, 2014 <br>
 * Time: 7:24:50 PM <br>
 * Year: 2014 <p>
 *
 * By: 598Johnn897 <p>
 * 
 * Project: AutoWalls <br>
 * File: TeamYellow.java <br>
 * Package: com.jkush321.autowalls.team <p>
 * 
 * @author 598Johnn897
 */
public class TeamYellow extends Team {

	public TeamYellow() {
		super("Yellow", ChatColor.YELLOW);
	}
	
	private ArrayList<Player> players = new ArrayList<Player>();

	public ArrayList<Player> getPlayers() {
		return players;
	}
}
