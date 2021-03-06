package com.merits.api.tests;

import com.merits.api.MeritsAPI;
import com.merits.api.data.Award;
import com.merits.api.data.ProjectAwards;

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
public class GetProjectAwards {

	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	// CONSTRUCTORS -----------------------------------------------------------


	// PUBLIC -----------------------------------------------------------------


	public static void main(String[] args) throws Exception {
		// Local Variables
		ProjectAwards awards;
		// Setup test
		MeritsAPI.setAPIHost(TestsConfig.TESTS_HOST);
		MeritsAPI.setAPIKey(TestsConfig.TESTS_API_KEY);
		MeritsAPI.setAPISecret(TestsConfig.TESTS_API_SECRET);
		// Run test
		awards = MeritsAPI.getProjectAwards("PRJ1");
		for(Award award : awards.getAwards()) {
			System.out.println(award);
		}
	}
}
