package io.sporkpgm.team;

import io.sporkpgm.match.Match;

import org.bukkit.ChatColor;

public class SporkTeam {

	private Match match;

	private String name;
	private ChatColor color;
	private int max;

	private TeamType type;

	public SporkTeam(String name, ChatColor color, int max, TeamType type) {
		this.name = name;
		this.color = color;
		this.max = max;
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ChatColor getColor() {
		return color;
	}

	public int getMax() {
		return max;
	}

	public TeamType getType() {
		return type;
	}

	public String getColoredName() {
		return getColor() + getName();
	}

	public Match getMatch() {
		return match;
	}
	
	public SporkTeam update(Match match) {
		this.match = match;
		return this;
	}

	public String toString() {
		return getName();
	}

	public enum TeamType {
		OBSERVING, PARTICIPATING;
	}

}