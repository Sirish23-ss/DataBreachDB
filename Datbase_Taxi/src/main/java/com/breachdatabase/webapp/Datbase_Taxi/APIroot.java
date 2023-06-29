package com.breachdatabase.webapp.Datbase_Taxi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONArray;

public class APIroot {
	public static List<Breach> sendGET() throws IOException {
		URL endpointUrl = new URL("https://haveibeenpwned.com/api/v3/breaches");
		HttpURLConnection connection = (HttpURLConnection) endpointUrl.openConnection();
		connection.setRequestMethod("GET");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setRequestProperty("Accept", "application/json");
		connection.connect();
		String responseBody = new BufferedReader(new InputStreamReader(connection.getInputStream())).lines()
				.collect(Collectors.joining("\n"));
		connection.disconnect();
		JSONArray jsonArray =new JSONArray(responseBody);
		converJSON convertJSON= new converJSON();
		List<Breach> all_breachs=convertJSON.ArrayToOBJ(jsonArray);
		
		
		return all_breachs;
		//System.out.print(all_breachs.get(676));
		
	}

}
