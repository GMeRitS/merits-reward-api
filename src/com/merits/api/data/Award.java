package com.merits.api.data;

//IMPORTS --------------------------------------------------------------------

import org.json.JSONObject;


/**
 * <b>Title: </b> <br/>
 * <b>Description: </b> <br/>
 * <b>Copyright: </b>Copyright (c) 2020 Weezzi Enterprise<br/>
 * <b>Company: </b><A HREF="http://www.weezzienterprise.com">Weezzi Enterprise</A><br/>
 *
 * @author luis
 * @version 1.0
 */
public class Award {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------

	private String id;
	private String name;
	private float reward;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public Award() {
		// Initialization
	}

	
	// PUBLIC -----------------------------------------------------------------


	/**
	 * Gets id
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * Sets id
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * Gets name
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * Sets name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * Gets reward
	 * @return the reward
	 */
	public float getReward() {
		return reward;
	}


	/**
	 * Sets reward
	 * @param reward the reward to set
	 */
	public void setReward(float reward) {
		this.reward = reward;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public static Award parse(JSONObject response) {
		// Local Variables
		Award data = new Award();
		data.setId(response.getString("id"));
		data.setName(response.getString("name"));
		data.setReward(response.getFloat("value"));
		return data;
	}
	

	/**
	 * Prints award info
	 * @return Info
	 */
	public String toString() {
		// Local Variables
		return name + " (" + id + ")";
	}
}
