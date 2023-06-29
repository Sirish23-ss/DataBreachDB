package com.breachdatabase.webapp.Datbase_Taxi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class converJSON {
	
	
	
	public List<Breach> ArrayToOBJ (JSONArray jsonArray) {
		List<Breach> breachs= new ArrayList<Breach>();
		
		for (int i=0; i<jsonArray.length();i++) {
			Breach breach = new Breach();
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			breach.setName(jsonObject.getString("Name"));
	        breach.setTitle(jsonObject.getString("Title"));
	        breach.setDomain(jsonObject.getString("Domain"));
	        breach.setBreachDate(jsonObject.getString("BreachDate"));
			breach.setAddedDate(jsonObject.getString("AddedDate"));
			breach.setPwnCount(jsonObject.getLong("PwnCount"));
			breach.setDescription(jsonObject.getString("Description"));
			breach.setLogoPath(jsonObject.getString("LogoPath"));
			//breach.setDataClasseStrings(jSONArraytoList(jsonObject.getJSONArray("DataClasses")));
			breach.setDataClasseStrings(jsonObject.getJSONArray("DataClasses"));
			breach.setIsVerified(jsonObject.getBoolean("IsVerified"));
			breach.setIsFabricated(jsonObject.getBoolean("IsFabricated"));
			breach.setIsSensitive(jsonObject.getBoolean("IsSensitive"));
			breach.setIsRetired(jsonObject.getBoolean("IsRetired"));
			breach.setIsSpamList(jsonObject.getBoolean("IsSpamList"));
			breach.setIsMalware(jsonObject.getBoolean("IsMalware"));
			breach.setModifiedDateString(jsonObject.getString("ModifiedDate"));
			breachs.add(breach);
			
		}
		return breachs;
	}
	
	public String[] jSONArraytoList(JSONArray subJsonArray){
		String[] storedClassList = null;
		
		for (int i=0; i<subJsonArray.length();i++) {
			storedClassList[i]=subJsonArray.getString(i);
		}
	  
		return storedClassList;
		
	}

}
