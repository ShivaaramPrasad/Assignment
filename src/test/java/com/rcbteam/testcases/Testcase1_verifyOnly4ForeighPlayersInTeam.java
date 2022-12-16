package com.rcbteam.testcases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iplteam.readinputfiles.ReadJSONFileData;

public class Testcase1_verifyOnly4ForeighPlayersInTeam {

	//Write a test that validates that the team has only 4 foreign players
	@Test
	public void test1_verifyOnly4ForeighPlayersInTeam() throws IOException, ParseException {
		int expectedForeignPlayerCount=4;
		int actualForeignPlayerCount=verifyOnly4ForeighPlayersInTeam();
		Assert.assertEquals(expectedForeignPlayerCount, actualForeignPlayerCount);
	}

	/* 
	 * Steps:
	 * Read Json Data and Store in String Array, declare countOfForeginPlayers initial value as zero
	 * Iterate for loop using Array length and Extract country values using split method and store as String array  
	 * Compare Country is matched with "india", then increment countOfForeginPlayers by 1 
	 * Once loop complete, check countOfForeginPlayers is equal to 4, if yes,then return the count from method
	 * Using Assertion Compare expected and actual and verify the test
	 * 
	 */
	public int verifyOnly4ForeighPlayersInTeam() throws IOException, ParseException {
		String[] readJsonDataFile = ReadJSONFileData.readJsonDataFile();
		int countOfForeginPlayers=0;
		for(int i=2;i<readJsonDataFile.length;i++) {
			String[] split = readJsonDataFile[i].split(",");
			String coutry=split[1].toLowerCase();
			if(!coutry.equalsIgnoreCase("india")) countOfForeginPlayers++;
		}
		return countOfForeginPlayers;
		
	}	
}
