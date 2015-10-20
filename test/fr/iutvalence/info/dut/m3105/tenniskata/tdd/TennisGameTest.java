package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	@Test
	public void makeSureThatScoreIsLoveAllAtBeginnning()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScore(), "love all");
	}
	
	@Test
	public void afterOnePointScoreIsFifteenAll()
	{
		TennisGame newTennisGame = new TennisGame();
		assertEquals(newTennisGame.getScoreAfterPoint(), "fifteen love");
	}

}
