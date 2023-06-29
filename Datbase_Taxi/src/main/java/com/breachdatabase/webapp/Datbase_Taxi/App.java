package com.breachdatabase.webapp.Datbase_Taxi;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.*;
import twitter4j.*;

/**
 * Hello world!
 *
 */
public class App {
	private static APIroot apIroot = new APIroot();
	private static DatabaseConection dbConection = new DatabaseConection();

	public static void main(String[] args) throws IOException {

		try {
			dbConection.connectionDB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
