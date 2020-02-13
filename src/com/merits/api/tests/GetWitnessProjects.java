package com.merits.api.tests;

import com.merits.api.MeritsAPI;
import com.merits.api.data.Project;
import com.merits.api.data.WitnessProjects;

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
public class GetWitnessProjects {

	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	// CONSTRUCTORS -----------------------------------------------------------


	// PUBLIC -----------------------------------------------------------------


	public static void main(String[] args) throws Exception {
		// Local Variables
		WitnessProjects projects;
		// Setup test
		MeritsAPI.setAPIHost(TestsConfig.TESTS_HOST);
		MeritsAPI.setAPIKey(TestsConfig.TESTS_API_KEY);
		MeritsAPI.setAPISecret(TestsConfig.TESTS_API_SECRET);
		// Run test
		projects = MeritsAPI.getWitnessProjects("AHOZ5");
		for(Project project : projects.getProjects()) {
			System.out.println(project);
		}
	}
}
