package com.merits.api.data;

import java.util.Vector;

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
public class ProjectVolunteers {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	private Vector<Volunteer> volunteers;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public ProjectVolunteers() {
		// Initialization
		this.volunteers = new Vector<>();
	}

	
	// PUBLIC -----------------------------------------------------------------


	/**
	 * Gets volunteers
	 * @return the volunteers
	 */
	public Vector<Volunteer> getVolunteers() {
		return volunteers;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public void parse(JSONObject response) {
		// Local Variables
		
	}
	

}
