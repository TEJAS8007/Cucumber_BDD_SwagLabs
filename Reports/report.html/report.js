$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/SwagLabs.feature");
formatter.feature({
  "line": 1,
  "name": "Purchasing product on SwagLabs",
  "description": "",
  "id": "purchasing-product-on-swaglabs",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4948354500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": ":Succesfull Login with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user should launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Navigate to \"https://www.saucedemo.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user should enter Login data",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Login Should be Success",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should Login Succesfully",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User should verify title of webpage",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user should click on add to cart button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on cart button at top",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User verify selected product in desciption box",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Add To cart process Complete",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_launch_chrome_browser()"
});
formatter.result({
  "duration": 479289600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 18
    }
  ],
  "location": "StepDef.user_Navigate_to(String)"
});
formatter.result({
  "duration": 2444185300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_enter_Login_data()"
});
formatter.result({
  "duration": 583080700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_login_button()"
});
formatter.result({
  "duration": 544658600,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.login_Should_be_Success()"
});
formatter.result({
  "duration": 218800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_Login_Succesfully()"
});
formatter.result({
  "duration": 286100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_verify_title_of_webpage()"
});
formatter.result({
  "duration": 70113800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_click_on_add_to_cart_button()"
});
formatter.result({
  "duration": 110953300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_cart_button_at_top()"
});
formatter.result({
  "duration": 156258300,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_verify_selected_product_in_desciption_box()"
});
formatter.result({
  "duration": 244551800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_checkout_button()"
});
formatter.result({
  "duration": 292147900,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.add_To_cart_process_Complete()"
});
formatter.result({
  "duration": 1362000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "payment verification OF Added Product",
  "description": "",
  "id": "purchasing-product-on-swaglabs;payment-verification-of-added-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user should have added product to cart",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User enter FirstName",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user should enter LastName",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should have to enter zipcode",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user should verify payment Information",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user should verify price total",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "click on finish",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_have_added_product_to_cart()"
});
formatter.result({
  "duration": 688100,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_enter_FirstName()"
});
formatter.result({
  "duration": 1639644200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_enter_LastName()"
});
formatter.result({
  "duration": 203746700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_have_to_enter_zipcode()"
});
formatter.result({
  "duration": 326605500,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_continue_button()"
});
formatter.result({
  "duration": 166269000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_verify_payment_Information()"
});
formatter.result({
  "duration": 119331400,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.user_should_verify_price_total()"
});
formatter.result({
  "duration": 110778200,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_finish()"
});
formatter.result({
  "duration": 191927200,
  "status": "passed"
});
formatter.after({
  "duration": 1024124100,
  "status": "passed"
});
});