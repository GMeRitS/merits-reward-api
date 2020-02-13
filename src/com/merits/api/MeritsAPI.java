package com.merits.api;

// IMPORTS --------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;
import com.merits.api.data.Award;
import com.merits.api.data.Period;
import com.merits.api.data.ProjectAwards;
import com.merits.api.data.ProjectPeriods;
import com.merits.api.data.ProjectVolunteers;
import com.merits.api.data.Volunteer;
import com.merits.api.data.WitnessProjects;


/**
 * <b>Title: </b> <br/>
 * <b>Description: </b> <br/>
 * <b>Copyright: </b>Copyright (c) 2020 Weezzi Enterprise<br/>
 * <b>Company: </b><A HREF="http://www.weezzienterprise.com">Weezzi Enterprise</A><br/>
 *
 * @author luis
 * @version 1.0
 */
public class MeritsAPI {


	// CONSTANTS --------------------------------------------------------------


	private static boolean LOG = true;
	private static String API_HOST = "https://www.merits-system.com";
	private static final String BASE_API_URL = "/servlets/api/";
	private static String API_KEY;
	private static String API_SECRET;
	


	// PROPERTIES -------------------------------------------------------------


	// CONSTRUCTORS -----------------------------------------------------------


	// PUBLIC -----------------------------------------------------------------

	
	/**
	 * Sets the Host for the API
	 * @param host
	 */
	public static void setAPIHost(String host) {
		API_HOST = host;
	}

	
	/**
	 * Sets the API key
	 * @param key
	 */
	public static void setAPIKey(String key) {
		API_KEY = key;
	}

	
	/**
	 * Sets the API secret
	 * @param secret
	 */
	public static void setAPISecret(String secret) {
		API_SECRET = secret;
	}

	
	/**
	 * Sets API message log active 
	 * @param active Sets the log active
	 */
	public static void setLog(boolean active) {
		LOG = active;
	}

	
	/**
	 * Retrieves all a witness projects
	 * @param witnessId
	 * @return
	 * @throws Exception
	 */
	public static WitnessProjects getWitnessProjects(String witnessId) throws Exception {
		// Local Variables
		JSONObject response;
		WitnessProjects projects;
		// Get projects
		response  = makeRequest("getprojects?WitnessId=" + witnessId, null);
		projects = new WitnessProjects();
		projects.parse(response);
		return projects;
	}

	
	/**
	 * Retrieves a projects reporting periods
	 * @param projectId
	 * @return
	 * @throws Exception
	 */
	public static ProjectPeriods getProjectPeriods(String projectId) throws Exception {
		// Local Variables
		JSONObject object;		
		JSONObject response;
		ProjectPeriods periods;
		// Get projects
		response  = makeRequest("getperiods?ProjectId=" + projectId, null);
		periods = new ProjectPeriods();
		JSONArray array = response.getJSONArray("periods");
		// Parse data
		for(int n = 0; n < array.length(); n++) {
		    object = array.getJSONObject(n);
		    periods.getPeriods().add(Period.parse(object));
		}
		return periods;
	}

	
	/**
	 * Retrieves volunteers in a project for a specific behaviour witness
	 * @param projectId
	 * @return
	 * @throws Exception
	 */
	public static ProjectVolunteers getProjectVolunteers(String witnessId, String projectId) throws Exception {
		// Local Variables
		JSONObject object;		
		JSONObject response;
		ProjectVolunteers volunteers;
		// Get projects
		response  = makeRequest("getvolunteers?WitnessId=" + witnessId + "&ProjectId=" + projectId, null);
		volunteers = new ProjectVolunteers();
		JSONArray array = response.getJSONArray("volunteers");
		// Parse data
		for(int n = 0; n < array.length(); n++) {
		    object = array.getJSONObject(n);
		    volunteers.getVolunteers().add(Volunteer.parse(object));
		}
		return volunteers;
	}

	
	/**
	 * Retrieves a project rewards
	 * @param projectId
	 * @return
	 * @throws Exception
	 */
	public static ProjectAwards getProjectAwards(String projectId) throws Exception {
		// Local Variables
		JSONObject object;		
		JSONObject response;
		ProjectAwards awards;
		// Get projects
		response  = makeRequest("getawards?ProjectId=" + projectId, null);
		awards = new ProjectAwards();
		JSONArray array = response.getJSONArray("awards");
		// Parse data
		for(int n = 0; n < array.length(); n++) {
		    object = array.getJSONObject(n);
		    awards.getAwards().add(Award.parse(object));
		}
		return awards;
	}

	

	public static boolean awardVolunteer(String projectId, String witnessId, String volunteerId, String awardId) throws Exception {
		// Local Variables
		JSONObject response;
		// Get projects
		response  = makeRequest("award?ProjectId=" + projectId, null);
		if (response.has("success")) {
			response.getBoolean("success");
		}
		return false;
	}
	
	
	/**
	 * Makes a SWAPI HTTP Request
	 * @param method
	 * @param requestBody
	 * @return
	 * @throws Exception
	 */
	private static JSONObject makeRequest(String method, String requestBody) throws Exception {
		// Local Variables
		URL url;
		byte[] input;
		OutputStream os;
		BufferedReader br;
		HttpURLConnection con;
		StringBuilder response;
		String responseLine = null;
		// Create URL
		url = new URL (API_HOST + BASE_API_URL + method);
		if (LOG) {
			log("MeritsAPI (Request): URL=" + url.toExternalForm() +(requestBody != null?"    BODY:\n" + requestBody:""));
		}		
		con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json; utf-8");
		con.setRequestProperty("Accept", "application/json");
		con.setRequestProperty("API-Key", API_KEY);
		con.setRequestProperty("API-Secret", API_SECRET);
		con.setDoOutput(true);
		con.setConnectTimeout(1000);
		con.setReadTimeout(10000);
		os = con.getOutputStream();
		// Write body data 
		if (requestBody != null) {
			input = requestBody.getBytes("utf-8");
			os.write(input, 0, input.length);
		}
		// Read response
		br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
		response = new StringBuilder();
		while ((responseLine = br.readLine()) != null) {
			response.append(responseLine.trim());
		}
		if (LOG) {
			log("MeritsAPI (Response):\n" + response.toString());
		}		
		return new JSONObject(response.toString());		
	}


	
	
	
	private static void log(String log) {
		// Local Variables
		System.out.println(log);
	}



}
