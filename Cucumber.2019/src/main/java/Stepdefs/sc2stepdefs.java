package Stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sc2stepdefs {
	private WebDriver driver;

@Given("user launches the browser")
public void user_launches_the_browser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_H2A.05.18\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   
  //  throw new cucumber.api.PendingException();
}

@Given("user then clicks on signin button")
public void user_then_clicks_on_signin_button() {
	driver.findElement(By.linkText("SignIn")).click();
   // throw new cucumber.api.PendingException();
}

@When("user enters {string} and {string}")
public void user_enters_and(String username, String password) {
	driver.findElement(By .name("userName")).click();
	driver.findElement(By .name("userName")).sendKeys(username);
	driver.findElement(By .name("password")).click();
	driver.findElement(By .name("password")).sendKeys(password);
    //throw new cucumber.api.PendingException();
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {

	driver.findElement(By .name("Login")).click();
    //throw new cucumber.api.PendingException();
}

@Then("user is directed to testme app home page")
public void user_is_directed_to_testme_app_home_page() {
	String act=driver.getTitle();
	String exp="Home";
	if(act==exp)
	{
		System.out.println("Succesful login");
	}
    
//    throw new cucumber.api.PendingException();
}

}
