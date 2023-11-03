$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel Using Adactin Application",
  "description": "",
  "id": "booking-hotel-using-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-using-adactin-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user Launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user Click On The Login Button And It Navigate To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Url()"
});
formatter.result({
  "duration": 6462170500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 96387700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 55645200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 498869400,
  "status": "passed"
});
});