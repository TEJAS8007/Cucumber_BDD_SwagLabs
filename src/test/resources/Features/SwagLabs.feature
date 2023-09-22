Feature:Purchasing product on SwagLabs

Background::Succesfull Login with valid credentials
Given user should launch chrome browser
When User Navigate to "https://www.saucedemo.com/"
And user should enter Login data
And click on login button
Then Login Should be Success
Given user should Login Succesfully
When User should verify title of webpage 
And user should click on add to cart button
And click on cart button at top
And User verify selected product in desciption box
And Click on checkout button
Then Add To cart process Complete

@Regression
Scenario:payment verification OF Added Product
Given user should have added product to cart
When User enter FirstName
And user should enter LastName
And user should have to enter zipcode
And click on continue button
And user should verify payment Information
And user should verify price total
And click on finish 