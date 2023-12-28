package com.test;

import org.testng.annotations.Test;
import com.base.baseclass;
import com.page.LoginPage;

public class LoginPageTest extends baseclass
{

	LoginPage loginpage;

	//Question 1 
	@Test(priority=1)
	public void LoginAmazonTest() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 1 : Verify that a user with valid credentials can successfully log in and access the system");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Enter Email ID and click on the continue button");
		logger.pass("Click on the Show password checkmark to hide the password because in this it is already checkmark on Show password so we hide it");
		logger.pass("Enter the Password and click on the Sign In Button");

		loginpage.loginwithvalidcredentialAmazon();

	}

	//Question 2 
	@Test(priority=2)
	public void LoginwithInvalidUserTest() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 2 : Validate that an error message is displayed when attempting to log in with invalid credentials");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Enter Email ID and click on the continue button");
		logger.pass("Click on the Show password checkmark to hide the password because in this it is already checkmark on Show password so we hide it");
		logger.pass("Enter the Wrong Password and click on the Sign In Button");
		logger.pass("Check the error message is displayed or not If displayed print it on the console");

		loginpage.loginwithInvalidCredentialAmazon();

	}

	//Question 3 
	@Test(priority=3)
	public void GettingFailedValues() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 3 : Ensure that the login page retains the entered username and password field's values after a failed login attempt");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Enter Email ID and click on the continue button");
		logger.pass("Click on the Show password checkmark to hide the password because in this it is already checkmark on Show password so we hide it");
		logger.pass("Enter the Wrong Password and click on the Sign In Button");


		loginpage.failedLoginAttempt();

	}

	//Question 4 - For this question we will consider the Continue button is Enabled or Disabled ? because exact scenario is not present on Amazon App so we do this one
	@Test(priority=4)
	public void LoginbuttonDisabled() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 4 : Test that the 'Login' button is disabled when both username and password fields are empty");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Check if continue button is disabled or enabled");


		loginpage.loginbuttonDisabled();
	}

	//Question 5
	@Test(priority=5)
	public void LoginbuttonEnabled() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 5 : Confirm that the 'Login' button is enabled only when both username and password fields are filled with valid input");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Add the username and click on the continue button");
		logger.pass("Add the password");
		logger.pass("Check the Login button is enabled or disabled");

		loginpage.loginbuttonEnabled();
	}

	//Question 6
	@Test(priority=6)
	public void PasswordRecoveryPageRedirect() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 6 : Verify that clicking the 'Forgot Password' link redirects the user to the password recovery page");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Add the username and click on the continue button");
		logger.pass("Click on the forgot password link");
		logger.pass("Check if user clicks on the forgot password link it will redirect to the password recovery page");
		
		loginpage.redirectPasswordRecoveryPage();
	}
	
	//Question 7 - Seventh question points a,b,c covered and d,e,f,g,h has been missed by me but I will explain how to achieve the solution
	@Test(priority=7)
	public void PasswordRecoveryFunctionality() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 7 : Validate the password recovery functionality by following the steps");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Add the username and click on the continue button");
		logger.pass("Click on the forgot password link");
		logger.pass("Check if user clicks on the forgot password link it will redirect to the password recovery page");

		loginpage.redirectPasswordRecoveryFunctionality();
	}
	
	@Test(priority=8)
	public void PaginationOnLogin() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 8 : Account for pagination on the login page and the script to automatically navigate through multiple pages, ensuring that all relevant data is captured");
		logger.pass("Launch Amazon App through script");
		logger.pass("Click on the Sign In Icon");
		logger.pass("Add the username and click on the continue button");
		logger.pass("Add the password and click on the continue button");
		logger.pass("Now we print the data associated with page in 2 different ways : In step 1 we print the data from Prime Schemes page");
		logger.pass("In Step 2 we print the data from the next page and also assigned do while loop to do it");
		
		
		loginpage.loginPagination();
	}
	
	@Test(priority=9)
	public void CheckStrengthofPassword() throws Exception 
	{
		loginpage = new LoginPage();

		logger=	extent.createTest("Test Case 9 : Check the strength of the password and validation messages for the same");
		logger.pass("Launch app enter email or username click on continue button");
		logger.pass("define the password in the string format");
		logger.pass("Enter the password and check the strength of password - ");
		logger.pass("Then We check it was Strong or Weak");
		logger.pass("Then We Validate the validation message");
		
		loginpage.passwordStrengthCheck();
	}
}
