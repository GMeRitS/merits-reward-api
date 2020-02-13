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
public class Period {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------

	private String id;
	private String name;
	private long startDate;
	private long endDate;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public Period() {
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
	 * Gets startDate
	 * @return the startDate
	 */
	public long getStartDate() {
		return startDate;
	}


	/**
	 * Sets startDate
	 * @param startDate the startDate to set
	 */
	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}


	/**
	 * Gets endDate
	 * @return the endDate
	 */
	public long getEndDate() {
		return endDate;
	}


	/**
	 * Sets endDate
	 * @param endDate the endDate to set
	 */
	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public static Period parse(JSONObject response) {
		// Local Variables
		Period data = new Period();
		data.setId(response.getString("id"));
		data.setName(response.getString("name"));
		data.setStartDate(response.getLong("startDate"));
		data.setEndDate(response.getLong("endDate"));
		return data;
	}
	
	
	/**
	 * Prints period info
	 * @return Info
	 */
	public String toString() {
		// Local Variables
		return name + " (" + id + ")";
	}
	

}
