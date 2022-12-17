# Assignment

<h2>Tech Stack Details:</h2>
<ul>
<li>Java 8,Eclipse IDE, Maven,TestNG,JSON-Simple</li>
</ul>

<h2>Steps for Project Creation and Testcase Design:</h2>
<ul>
<li>Created Maven Project Name as "IPLTeam"</li>
<li>POM.XML - Added the following dependencies "testng - version 6.14.3 and json-simple - version 1.1.1"</li>
<li>Under src/main/resources->testdata->added "TeamRCB" json File</li>
<li>Under src/main/java->com.iplteam.utility->Created "ReadJSONFileData" class</li>
<li>"ReadJSONFileData" class has added the below methods:</li>
	<ul>
	<li>readJsonDataFile(String fileName)  - Read the JSON file,parse and get JSONObject</li>
	<li>fetchData() - Fetch data from JSON Array</li>
	</ul>
<li>Under src/test/java->"com.rcbteam.testcases" package->Craeted "ValidateIPLTeam" class</li>
<li>"ValidateIPLTeam" class has added the below methods:</li>
	<ul>
	<li>preSetUp()- Read JSON File and Fetch JSON Array data</li>
	<li>test1_verifyForeignPlayersCount() - Verify Foreign Players Count</li> 
	<li>test1_verifyWicketKeeperCount() - Verify Wicket-Keeper Count</li>
	</ul>
</ul> 

<h2>Steps to Run Project</h2>
<ul>
<li>Created "testng.xml" file</li>
<li>Included "ValidateIPLTeam" class inside testng.xml suite</li>
<li>Right on the "testng.xml"->Run as TestNG Suite</li>
<li>Check Results for running class "ValidateIPLTeam" for test results</li>
</ul>
 
	
