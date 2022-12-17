package com.rcbteam.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.iplteam.utility.ReadJSONFileData;

public class ValidateIPLTeam {

	/**
	 * Read JSON File and Fetch JSON Array data
	 */
	@BeforeTest
	public void preSetUp(){
		ReadJSONFileData.readJsonDataFile("TeamRCB");
		ReadJSONFileData.fetchData();
	}

	/**
	 *Verify Foreign Players Count 
	 */
	@Test
	public void test1_verifyForeignPlayersCount() {
		Assert.assertTrue(ReadJSONFileData.foreignPlayerCount==4);
	}

	/**
	 *Verify Wicket-Keeper Count 
	 */
	@Test
	public void test1_verifyWicketKeeperCount(){
		Assert.assertTrue(ReadJSONFileData.wicketKeeperCount>=1);
	}
}
