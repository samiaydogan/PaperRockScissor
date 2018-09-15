package com.prs.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.prs.game.Round;
import com.prs.gestures.Game;
import com.prs.gestures.Gesture;

class GameTest {

	@Test
	public void playRoundTest() {
		Game game = new Game();
		Round round = game.playRound(Gesture.PAPER);
		assertNotNull(round);
		assertNotNull(round.getResult());
		assertNotNull(round.getComputerGesture());
		assertEquals(round.getUserGesture().isBetterThan(round.getComputerGesture()), round.getResult());
		
	}

}
