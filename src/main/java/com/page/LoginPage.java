package com.page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.baseclass;

public class LoginPage extends baseclass
{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.view.View[@content-desc=\"Sign in ›\"]/android.widget.TextView")
	public WebElement signInTextBtn;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Select English\"]")
	public WebElement selectEnglish;
	
	@FindBy(id = "in.amazon.mShop.android.shopping:id/continue_button")
	public WebElement continueInEnglish;
	
	@FindBy(xpath ="//android.view.View[@content-desc=\"your account\"]/android.widget.TextView")
	public WebElement signInBtn;
	
	@FindBy(id = "ap_email_login")
	public WebElement emailTextbox;
	
	@FindBy(id = "continue")
	public WebElement continueBtn;
	
	@FindBy(id = "ap_password")
	public WebElement password;
	
	@FindBy(id = "signInSubmit")
	public WebElement passSubmitBtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View")
	public WebElement passErrorMsg;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.widget.TextView[1]")
	public WebElement passHide;
	
	@FindBy(xpath = "//android.view.View[@content-desc=\"Forgot password?\"]/android.widget.TextView")
	public WebElement forgotPassLink;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.widget.TextView[1]")
	public WebElement pageText;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.widget.TextView[2]")
	public WebElement passrecoveryText;	
	 
	@FindBy(id = "ap_email")
	public WebElement passRecoverEmail;	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.TextView[1]")
	public WebElement VerificationText;
	
	@FindBy(id = "cvf-input-code")
	public WebElement enterOTP;	
	
	@FindBy(id = "Prime Prime")
	public WebElement primeBtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[1]")
	public WebElement fiftyText;		
	
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[2]")
	public WebElement readFAQ;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[6]")
	public WebElement joinPrime;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[7]")
	public WebElement verifyAge;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.widget.TextView[8]")
    public WebElement getCashback;
    
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View/android.view.View[5]")
    public WebElement yearsOld;
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"see more Prime plans\"]/android.widget.TextView")
    public WebElement seeMorePlan;
    
    @FindBy(id = "accordion")
	public WebElement tryPrimeFree;
    
    @FindBy(xpath = "//android.view.View[@content-desc=\"Amazon.in\"]")
   	public WebElement amazonLogo;
    
	public void loginwithvalidcredentialAmazon() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			continueBtn.click();
			passHide.click();
			password.click();
			password.sendKeys("Rupesh@18");
			passSubmitBtn.click();
			 WebElement successUserName = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rupesh ›\"]/android.widget.TextView[1]"));
		     String actualMessage = successUserName.getText();
		     String expectedMessage = "Rupesh ›";
		     assert actualMessage.equals(expectedMessage) : "User name is not Matched";
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void loginwithInvalidCredentialAmazon() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			continueBtn.click();
			passHide.click();
			password.click();
			password.sendKeys("Rupesh@198944");
			passSubmitBtn.click();
			WebElement errMsg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View"));
			if (errMsg.isDisplayed()) 
			{
				System.out.println("Error msg is : "+errMsg.getText());
			} else 
			{
				System.out.println("Error message not found");
			}
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void failedLoginAttempt() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			System.out.println("Entered mail id is: " + emailTextbox.getAttribute("text"));	
			String username = emailTextbox.getAttribute("text");
			continueBtn.click();
			passHide.click();
			password.click();
			password.sendKeys("Rupesh@1978910");
			String pass = password.getAttribute("text");
			passSubmitBtn.click();
			WebElement errMsg = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View"));
			if (errMsg.isDisplayed()) 
			{
				System.out.println("Entered username is "+ username + "& Password is :" + pass);
			} else 
			{
				System.out.println("Error message not found");
			}
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	
	public void loginbuttonDisabled() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			WebElement continueBtn = driver.findElement(By.id("continue"));
			if (continueBtn.isEnabled()) 
			{
				System.out.println("Continue button is enabled,Test failed!" );
			} else  
			{
				System.out.println("Continue button is disabled,Test passed! ");
			}
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void loginbuttonEnabled() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			continueBtn.click();
			passHide.click();
			password.click();
			password.sendKeys("Rupesh@18");
			if (passSubmitBtn.isEnabled()) {
	            System.out.println("Login button is enabled. Test passed!");
	        } else {
	            System.out.println("Login button is not enabled. Test failed!");
	        }
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void redirectPasswordRecoveryPage() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			continueBtn.click();
			forgotPassLink.click();
			if (pageText.isDisplayed()) {
	            System.out.println("Reached on Password recovery page :" + passrecoveryText.getText());
	          
	        } else {
	            System.out.println("Password recovery page not found. Test failed!");
	        }
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void redirectPasswordRecoveryFunctionality() throws InterruptedException {
		try 
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			continueInEnglish.click();
			signInBtn.click();
			emailTextbox.click();
			emailTextbox.sendKeys("rpshgawde@gmail.com");
			continueBtn.click();
			forgotPassLink.click();
			System.out.println("User clicked on forgot password link");
			System.out.println("Password recovery page Text is :" + pageText.getText());
	        System.out.println("Reached on Password recovery page so :" + passrecoveryText.getText());
	        passRecoverEmail.click();
	        passRecoverEmail.clear();
	        passRecoverEmail.sendKeys("rpshgawde@gmail.com");
	        continueBtn.click();
	        System.out.println("User see this :" + VerificationText.getText());
	        System.out.println("On this screen user get's OTP on their mail ");
	       
			Thread.sleep(3000);
		} catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public void loginPagination() throws InterruptedException 
	{
		loginwithvalidcredentialAmazon();
		System.out.println("User login successfully");
		//Step 1 :- we print the data from Prime Schemes page
		primeBtn.click();
		System.out.println("Now we are printing the data associated with that page - we printing only some part of data !");
		System.out.println(fiftyText.getText() +"\t\t\t"+ readFAQ.getText());
		System.out.println("Step 1 is :" + joinPrime.getText());
		System.out.println("Step 2 is :" + verifyAge.getText());
		System.out.println("Step 3 is :" + getCashback.getText());
		System.out.println("Note :" + yearsOld.getText());
		seeMorePlan.click();
		System.out.println("User gets Info :" + tryPrimeFree.getText());
		amazonLogo.click();
		//Step 2 :- we started the pagination in dynamic way to capture overall data from the page
		amazonPagination();
		
	}
	
	private static void amazonPagination() {
        
        WebElement categoryPage = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Category Shop By\"]/android.widget.TextView[1]"));
        categoryPage.click();
        do {
            captureData();

            WebElement nextPageButton = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Echo, Alexa, Fire TV\"]/android.widget.Image"));
            if (nextPageButton.isDisplayed()) {
                nextPageButton.click();
            } else {
                
                break;
            }
        } while (true);
    }
	
	
	 private static void captureData() {
	        // Here we Implements the logic to capture relevant data from our current page
	        List<WebElement> data = driver.findElements(By.id("a-page"));
	        for (WebElement dataElement : data) {
	            System.out.println(dataElement.getText());
	        }
	    }
	 
	 public void passwordStrengthCheck() throws InterruptedException 
	 {
		 try 
		 {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			 wait.until(ExpectedConditions.elementToBeClickable(selectEnglish)).click();
			 continueInEnglish.click();
			 signInBtn.click();
			 emailTextbox.click();
			 emailTextbox.sendKeys("rpshgawde@gmail.com");
			 continueBtn.click();
			 password.click();
			 String actualPassword = "Rupesh@1889";
			 password.sendKeys(actualPassword);
			 
			 if (isStrongPassword(actualPassword))
			 {
		            System.out.println("Password is strong!");
		     } else
		     {
		            System.out.println("Password is weak!");
		     }
			 passSubmitBtn.click();
			 WebElement validationMessage = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Rupesh ›\"]/android.widget.TextView[1]"));
		     String actualMessage = validationMessage.getText();
		     String expectedMessage = "Welcome Rupesh";
		     assert actualMessage.equals(expectedMessage) : "Validation message is not as expected";
			
			 Thread.sleep(3000);
		 } catch (Exception e)
		 {
			 e.printStackTrace();

		 }
	 }
	 
	 private static boolean isStrongPassword(String password) {
	        return password.length() >= 8 &&
	                password.matches(".*[A-Z].*") &&
	                password.matches(".*[a-z].*") &&
	                password.matches(".*\\d.*") &&
	                password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
	    }
}
