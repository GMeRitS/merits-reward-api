# Merits Reward API

The Merits Reward API is made to provide integration with third party apps with the Merits platform, by providing functions to third-party behaviour witnesses to validate volunteers work.

This API is fully open source and can be used for both commercial or personal use.

## Version

The current version is 1.0

## Java version

To run the API you need Java 1.8 or greater. The compiled jar can be download [here](merits-reward-api.jar).

## Examples

In this section are provided examples on how to use the API on several different scenarios

##### Get witness projects

```java
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
```

##### Get witness projects

```java
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
```

##### Get project volunteers

```java
ProjectVolunteers volunteers;
// Setup test
MeritsAPI.setAPIHost(TestsConfig.TESTS_HOST);
MeritsAPI.setAPIKey(TestsConfig.TESTS_API_KEY);
MeritsAPI.setAPISecret(TestsConfig.TESTS_API_SECRET);
// Run test
volunteers = MeritsAPI.getProjectVolunteers("AHOZ5", "PRJ1");
for(Volunteer volunteer : volunteers.getVolunteers()) {
	System.out.println(volunteer);
}
```

##### Get project periods

```java
ProjectPeriods periods;
// Setup test
MeritsAPI.setAPIHost(TestsConfig.TESTS_HOST);
MeritsAPI.setAPIKey(TestsConfig.TESTS_API_KEY);
MeritsAPI.setAPISecret(TestsConfig.TESTS_API_SECRET);
// Run test
periods = MeritsAPI.getProjectPeriods("PRJ1");
for(Period period : periods.getPeriods()) {
	System.out.println(period);
}
```

##### Get project award types

```java
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
```

##### Award a volunteer

```java
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
```



## 

## License

This project is licensed under the AGPL 3 License - see the [LICENSE](https://github.com/Commonfare-net/social-wallet-api/blob/master/LICENSE) file for details