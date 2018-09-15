package com.prs.game;

public enum Result {

	WIN("You win"), LOSE("You lose"), DEUCE("Deuce!!!");

	private String description;

	Result(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}
