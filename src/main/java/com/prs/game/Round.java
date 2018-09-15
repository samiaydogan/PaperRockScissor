package com.prs.game;

import com.prs.gestures.Gesture;

public class Round {

	private Gesture userGesture;
	private Gesture computerGesture;
	private Result result;

	public Round(Gesture userMove, Gesture computerMove, Result result) {
		super();
		this.userGesture = userMove;
		this.computerGesture = computerMove;
		this.result = result;
	}

	public Gesture getUserGesture() {
		return userGesture;
	}

	public void setUserGesture(Gesture userMove) {
		this.userGesture = userMove;
	}

	public Gesture getComputerGesture() {
		return computerGesture;
	}

	public void setComputerGesture(Gesture computerMove) {
		this.computerGesture = computerMove;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

}
