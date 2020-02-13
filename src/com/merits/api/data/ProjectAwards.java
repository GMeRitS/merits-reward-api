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
public class ProjectAwards {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	private Vector<Award> awards;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public ProjectAwards() {
		// Initialization
		this.awards = new Vector<>();
	}

	
	// PUBLIC -----------------------------------------------------------------


	/**
	 * Gets awards
	 * @return the awards
	 */
	public Vector<Award> getAwards() {
		return awards;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public void parse(JSONObject response) {
		// Local Variables
		
	}
	

}
