package com.merits.api.data;

import java.util.Vector;
import org.json.JSONArray;
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
public class WitnessProjects {


	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	private Vector<Project> projects;
	
	
	// CONSTRUCTORS -----------------------------------------------------------

	
	public WitnessProjects() {
		// Initialization
		this.projects = new Vector<Project>();  
	}

	
	// PUBLIC -----------------------------------------------------------------

	
	/**
	 * Parses a project JSON data
	 * @param response
	 */
	public void parse(JSONObject response) {
		// Local Variables
		Project prj;
		JSONObject object;		
		JSONArray array = response.getJSONArray("projects");
		// Parse data
		for(int n = 0; n < array.length(); n++) {
		    object = array.getJSONObject(n);
		    prj = new Project();
		    prj.setId(object.getString("id"));
		    prj.setName(object.getString("name"));
		    projects.add(prj);
		}
	}


	/**
	 * Gets projects
	 * @return the projects
	 */
	public Vector<Project> getProjects() {
		return projects;
	}


}
