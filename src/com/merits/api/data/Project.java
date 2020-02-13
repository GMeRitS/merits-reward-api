package com.merits.api.data;

import org.json.JSONObject;

// IMPORTS --------------------------------------------------------------------

/**
 * <b>Title: </b> <br/>
 * <b>Description: </b> <br/>
 * <b>Copyright: </b>Copyright (c) 2020 Weezzi Enterprise<br/>
 * <b>Company: </b><A HREF="http://www.weezzienterprise.com">Weezzi Enterprise</A><br/>
 *
 * @author luis
 * @version 1.0
 */
public class Project {

	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------

	
	private String id;
	private String name;
	

	// CONSTRUCTORS -----------------------------------------------------------

	
	public Project() {
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
	 * Prints project info 
	 */
	public String toString() {
		return name + " (" + id + ")";
	}


	public static Project parse(JSONObject response) {
		// Local Variables
		Project data = new Project();
		data.setId(response.getString("id"));
		data.setName(response.getString("name"));
		return data;
	}

}
