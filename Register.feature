Feature: NopCommerce Register
  Background:
    Given User open browser And Enter Url

    Scenario:Nopcommerce Register test
      Given User open browser And Enter Url
      Then User click on Register Option
      And User is on register page and verify the Register page Title
      Then User will click on Female Gender
      Then User will Enter First name and Last name
      Then User will Enter Day,Month,Year
      Then User will Enter EmailID
      Then User will Enter Company Name
      Then User will Enter Password
      Then User will Enter Confirm Password
      Then User will click on Register button.
      Then User will be on HomePage.