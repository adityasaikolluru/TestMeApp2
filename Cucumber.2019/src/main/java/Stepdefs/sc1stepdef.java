package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sc1stepdef {
	private WebDriver driver;
	
	@Given("user shall launch the testeapp url")
	public void user_shall_launch_the_testeapp_url() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");

	   // throw new cucumber.api.PendingException();
	}

	@Given("user clicks on signup")
	public void user_clicks_on_signup() {
		  driver.findElement(By.linkText("SignUp")).click();

	  //  throw new cucumber.api.PendingException();
	}

	@When("user provides valid details")
	public void user_provides_valid_details() {
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("sarat1473");
		driver.findElement(By .name("firstName")).click();
		driver.findElement(By .name("firstName")).sendKeys("sarat");
		driver.findElement(By .name("lastName")).click();
		driver.findElement(By .name("lastName")).sendKeys("mutta");
		driver.findElement(By .name("password")).click();
		driver.findElement(By .name("password")).sendKeys("pass123");
		driver.findElement(By .name("confirmPassword")).click();
		driver.findElement(By .name("confirmPassword")).sendKeys("pass123");
		driver.findElement(By .xpath("//input[@value='Male']")).click();
		driver.findElement(By .name("emailAddress")).click();
		driver.findElement(By .name("emailAddress")).sendKeys("sarat97@gmail.com");
		driver.findElement(By .name("mobileNumber")).click();
		driver.findElement(By .name("mobileNumber")).sendKeys("9876543210");
		driver.findElement(By .name("dob")).click();
		driver.findElement(By .name("dob")).sendKeys("20/11/1997");
		driver.findElement(By.id("address")).click();
		driver.findElement(By.id("address")).sendKeys("hyderabad");
		//driver.findElement(By .name("securityQuestion")).click();
		driver.findElement(By .name("securityQuestion")).sendKeys("What is your Birth Place?");
		//driver.findElement(By .name("answer")).click();
		driver.findElement(By .name("answer")).sendKeys("vizag");

	   // throw new cucumber.api.PendingException();
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
	    driver.findElement(By .name("Submit")).click();
	    //throw new cucumber.api.PendingException();
	}
	


@Then("user directed to login page")
public void user_directed_to_login_page() {
//	driver.findElement(By .xpath("//div[@text(),' User Registered Succesfully!!! Please login')]"));
	String exp=driver.findElement(By .id("errormsg")).getText();
    String act= " User Registered Succesfully!!! Please login";
	if(exp==act)
	{
		System.out.println("registered");
	}
   // throw new cucumber.api.PendingException();
}
	
}
