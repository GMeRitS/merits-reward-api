package com.merits.api.tests;

//IMPORTS --------------------------------------------------------------------

import com.merits.api.MeritsAPI;


/**
 * <b>Title: </b> <br/>
 * <b>Description: </b> <br/>
 * <b>Copyright: </b>Copyright (c) 2020 Weezzi Enterprise<br/>
 * <b>Company: </b><A HREF="http://www.weezzienterprise.com">Weezzi Enterprise</A><br/>
 *
 * @author luis
 * @version 1.0
 */
public class AwardVolunteer {

	// CONSTANTS --------------------------------------------------------------


	// PROPERTIES -------------------------------------------------------------


	// CONSTRUCTORS -----------------------------------------------------------


	// PUBLIC -----------------------------------------------------------------


	public static void main(String[] args) throws Exception {
		// Local Variables
		boolean success;
		// Setup test
		MeritsAPI.setAPIHost(TestsConfig.TESTS_HOST);
		MeritsAPI.setAPIKey(TestsConfig.TESTS_API_KEY);
		MeritsAPI.setAPISecret(TestsConfig.TESTS_API_SECRET);
		// Run test
		success = MeritsAPI.awardVolunteer(
				"PRJ112", // projectId, 
				"WIT182", // witnessId, 
				"VOL142", // volunteerId, 
				"AW881" // awardId
				);
		System.out.println("Success:" + success);
	}
}
