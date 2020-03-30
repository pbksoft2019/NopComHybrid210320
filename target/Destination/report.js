$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resources/features/register.feature");
formatter.feature({
  "name": "as user i should be able to register",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user should be able to register successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on register Button",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.click_on_register_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters registration details and click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_enters_registration_details_and_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "WebTest.MyStepDefs.user_should_be_able_to_register_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "welcome message should display",
  "keyword": "And "
});
formatter.match({
  "location": "WebTest.MyStepDefs.welcome_message_should_display()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Your registration completed expected [Your registration completed] but found [Registration not successful...]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:575)\r\n\tat WebTest.Utils.assertTextMessage(Utils.java:45)\r\n\tat WebTest.RegistrationResultPage.verifyUserSeeRegistrationSuccessMessage(RegistrationResultPage.java:16)\r\n\tat WebTest.MyStepDefs.welcome_message_should_display(MyStepDefs.java:48)\r\n\tat ✽.welcome message should display(file:///C:/Users/Prakash/IdeaProjects/NopComHybrid/./src/test/Resources/features/register.feature:8)\r\n",
  "status": "failed"
});
formatter.write("!!!!!!!Scenario Failed....!!!!!! Please see attached screenshot for the error/issue");
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});