# Assignment

Tech Stack Details:
-------------------------
Java 8,Eclipse IDE, Maven,TestNG,JSON-Simple

Steps for Project creation and Testcase Design:
------------------------------------------------
1.Created Maven Project as "IPLTeam"
2.POM.XML - Added the following dependencies "testng - version 6.14.3 and json-simple - version 1.1.1"
3.Under src/main/resources->testdata->added "TeamRCB" File
3.Under src/main/java->com.iplteam.utility->Created "ReadJSONFileData" class
4."ReadJSONFileData" class has added the below methods:
	a)readJsonDataFile(String fileName)  - Read the JSON file,parse and get JSONObject
	b)fetchData() - Fetch data from JSON Array
5.Under src/test/java->"com.rcbteam.testcases" package->Craeted "ValidateIPLTeam" class
6."ValidateIPLTeam" class has added the below methods:
	a)preSetUp()- Read JSON File and Fetch JSON Array data
	b)test1_verifyForeignPlayersCount() - Verify Foreign Players Count 
	c)test1_verifyWicketKeeperCount() - Verify Wicket-Keeper Count 

Steps to Run Project:
---------------------
1.Created "testng.xml" file
2.Included "ValidateIPLTeam" class inside testng.xml suite
3.Right on the "testng.xml"->Run as TestNG Suite
4.Check Results for running class "ValidateIPLTeam" for test results
