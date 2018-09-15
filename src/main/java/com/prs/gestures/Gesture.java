package com.prs.gestures;

import com.prs.game.Result;

public enum Gesture {

	PAPER("images/paper.png"), ROCK("images/rock.png"), SCISSOR("images/scissor.png");

	static {
		// determine relations between gestures. Who win against other?
		PAPER.setBetterThan(ROCK);
		ROCK.setBetterThan(SCISSOR);
		SCISSOR.setBetterThan(PAPER);
	}

	private String image;

	private Gesture worseGesture;

	private Gesture(String image) {
		this.image = image;
	}

	private void setBetterThan(Gesture gesture) {
		this.worseGesture = gesture;
	}

	public String getImage() {
		return image;
	}

	/**
	 * This method creates random Gesture.
	 * @return Gesture
	 */
	public static Gesture createComputerMove() {
		int moveIndex = (int) (Math.random() * 3);

		return values()[moveIndex];
	}

	/**
	 * This Method takes gesture object parameter, compares with itself and return result.
	 * @param otherGesture
	 * @return Result
	 */
	public Result isBetterThan(Gesture otherGesture) {

		// we can use == instead of equals because gestures are created once
		if (this == otherGesture) {
			return Result.DEUCE;
		} else if (this.worseGesture == otherGesture) {
			return Result.WIN;
		} else {
			return Result.LOSE;
		}
	}

}
