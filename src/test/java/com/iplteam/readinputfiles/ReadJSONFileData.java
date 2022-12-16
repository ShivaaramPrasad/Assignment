package com.iplteam.readinputfiles;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONFileData {

	public static String[] readJsonDataFile() throws IOException, ParseException {

		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader("C:\\Users\\kowsalya Karuppusamy\\eclipse-workspace\\DataStructureProblems\\IPLT20Team\\IPLTeam\\src\\test\\resources\\inputdatafiles\\TeamRCB.json");
		Object obj = jsonparser.parse(reader);
		JSONObject rcbTeamObj=(JSONObject)obj;
		String name= (String)rcbTeamObj.get("name");
		String location = (String)rcbTeamObj.get("location");
		JSONArray playerArr = (JSONArray)rcbTeamObj.get("player");
		String[] players=new String[playerArr.size()];
		String[] data=new String[2+playerArr.size()];
		data[0]=name;
		data[1]=location;
		for(int i=0;i<playerArr.size();i++) {
			JSONObject player=(JSONObject)playerArr.get(i);
			String nameArr=(String)player.get("name");
			String country=(String)player.get("country");
			String role=(String)player.get("role");
			players[i]=nameArr+","+country+","+role;
			data[i+2]=players[i];
		}
		return data;
	}
}
