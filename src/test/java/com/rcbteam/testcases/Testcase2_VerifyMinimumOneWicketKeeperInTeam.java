package com.rcbteam.testcases;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iplteam.readinputfiles.ReadJSONFileData;

public class Testcase2_VerifyMinimumOneWicketKeeperInTeam {


	//Write a test that validates that there is at least one wicket keeper
	@Test
	public void test2_VerifyMinimumOneWicketKeeperInTeam() throws IOException, ParseException {
		boolean expectedForeignPlayerCount=true;
		boolean actualForeignPlayerCount=verifyMinimumOneWicketKeeperInTeam();
		Assert.assertEquals(expectedForeignPlayerCount, actualForeignPlayerCount);
	}

	/* 
	 * Steps:
	 * Read Json Data and Store in String Array, declare oneWicketKeeperMinimun initial value as false
	 * Iterate for loop using Array length and Extract country values using split method and store as String array  
	 * Compare role is matched with "Wicket-keeper", If yes, return as true, else return as false 
	 * Using Assertion Compare expected and actual and verify the test
	 * 
	 */
	public boolean verifyMinimumOneWicketKeeperInTeam() throws IOException, ParseException {
		String[] readJsonDataFile = ReadJSONFileData.readJsonDataFile();
		boolean oneWicketKeeperMinimun=false;
		for(int i=2;i<readJsonDataFile.length;i++) {
			String[] split = readJsonDataFile[i].split(",");
			String role=split[2].toLowerCase();
			if(role.equalsIgnoreCase("Wicket-keeper")) return oneWicketKeeperMinimun=true;
		}
		return oneWicketKeeperMinimun;
	}

}
