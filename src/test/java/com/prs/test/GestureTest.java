package com.prs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.prs.game.Result;
import com.prs.gestures.Gesture;

class GestureTest {

	@Test
	public void createComputerMoveTest() {
		Gesture computerGesture = Gesture.createComputerMove();
		assertNotNull(computerGesture);
		assertNotNull(computerGesture.getImage());
		
	}
	
	@Test
	public void isBetterThanTest() {
			
		assertEquals(Gesture.PAPER.isBetterThan(Gesture.ROCK), Result.WIN);
		assertEquals(Gesture.PAPER.isBetterThan(Gesture.SCISSOR), Result.LOSE);
		assertEquals(Gesture.PAPER.isBetterThan(Gesture.PAPER), Result.DEUCE);
		assertEquals(Gesture.SCISSOR.isBetterThan(Gesture.ROCK), Result.LOSE);
		assertEquals(Gesture.SCISSOR.isBetterThan(Gesture.PAPER), Result.WIN);
		assertEquals(Gesture.SCISSOR.isBetterThan(Gesture.SCISSOR), Result.DEUCE);
		assertEquals(Gesture.ROCK.isBetterThan(Gesture.PAPER), Result.LOSE);
		assertEquals(Gesture.ROCK.isBetterThan(Gesture.SCISSOR), Result.WIN);
		assertEquals(Gesture.ROCK.isBetterThan(Gesture.ROCK), Result.DEUCE);
		
	}

}
