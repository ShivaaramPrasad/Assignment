package com.iplteam.utility;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFileData {
	public static JSONObject rcbTeamObj;
	public static int foreignPlayerCount=0;
	public static int wicketKeeperCount=0;

	/**
	 * Read the JSON file,parse and get JSONObject 
	 * 
	 * @param fileName 
	 */
	public static void readJsonDataFile(String fileName) {
		try {
			JSONParser jsonparser = new JSONParser();
			FileReader reader = new FileReader("./src/main/resources/testdata/" + fileName + ".json");
			Object obj = jsonparser.parse(reader);
			rcbTeamObj = (JSONObject) obj;
		}catch(Exception e) {
			printException(e);
		}
	}

	/**
	 * Fetch data from JSON Array
	 * 
	 */
	public static void fetchData(){
		try {
			if(rcbTeamObj!=null) {
				JSONArray playerArr = (JSONArray) rcbTeamObj.get("player");
				for(int i=0;i<playerArr.size();i++) { 
					JSONObject player=(JSONObject)playerArr.get(i);
					String country=(String)player.get("country");
					if(!country.equals("India")) foreignPlayerCount++;
					String role=(String)player.get("role");
					if(role.equals("Wicket-keeper")) wicketKeeperCount++;			
				}
			}else {
				System.out.println("Unable to fetch data");
			}
		}catch(Exception e) {
			printException(e);
		}
	}

	/**
	 * Handle exception throw and print exception message
	 * @param e
	 */
	private static void printException(Exception e) {
		System.out.println("Exception Message: "+e.getMessage());
		System.out.println("Stack Trace: "+e.getStackTrace());		
	}

}
