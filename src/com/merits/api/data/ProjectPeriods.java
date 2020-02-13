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
public class ProjectPeriods {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	private Vector<Period> periods;

	
	// CONSTRUCTORS -----------------------------------------------------------


	/**
	 * Default Constructor
	 */
	public ProjectPeriods() {
		// Initialization
		this.periods = new Vector<>();
	}

	
	// PUBLIC -----------------------------------------------------------------


	/**
	 * Gets periods
	 * @return the periods
	 */
	public Vector<Period> getPeriods() {
		return periods;
	}
	
	
	/**
	 * Parses a JSON response
	 * @param response
	 */
	public void parse(JSONObject response) {
		// Local Variables
		
	}
	

}
