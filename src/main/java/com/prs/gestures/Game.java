package com.prs.gestures;

import com.prs.game.Result;
import com.prs.game.Round;

public class Game {

	/**
	 * This method takes userGesture, creates computer gesture and return round
	 * object includes userGesture, computerGesture and result.
	 * 
	 * @param userGesture
	 * @return Round
	 */
	public Round playRound(Gesture userGesture) {
		Gesture computerGesture = Gesture.createComputerMove();
		Result result = userGesture.isBetterThan(computerGesture);
		Round round = new Round(userGesture, computerGesture, result);
		return round;
	}

}
