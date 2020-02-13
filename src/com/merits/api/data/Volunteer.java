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
public class Volunteer {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------

	private String id;
	private String name;
	private String photoUrl;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public Volunteer() {
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
	 * Gets photoUrl
	 * @return the photoUrl
	 */
	public String getPhotoUrl() {
		return photoUrl;
	}


	/**
	 * Sets photoUrl
	 * @param photoUrl the photoUrl to set
	 */
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public static Volunteer parse(JSONObject response) {
		// Local Variables
		Volunteer data = new Volunteer();
		data.setId(response.getString("id"));
		data.setName(response.getString("name"));
		if (response.has("photo")) {
			data.setPhotoUrl(response.getString("photo"));
		}
		return data;
	}
	

	/**
	 * Prints volunteer info
	 * @return Info
	 */
	public String toString() {
		// Local Variables
		return name + " (" + id + ")";
	}

}
