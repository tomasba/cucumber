package cucumberframework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	private WebDriver driver;

	@Before
	public void setup() {
		System.out.println("setup");
		System.setProperty("webdriver.chrome.driver",
				"D://projects//cucumber//cucumberframework//src//test//java//cucumberframework//resource//chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@After
	public void cleanup() {
		this.driver.manage().deleteAllCookies();
		//this.driver.quit();
		//this.driver = null;
	}
	
	@Given("^User navigates to stackoverflow web page$")
	public void user_navigates_to_stackoverflow_web_page() throws Throwable {
		this.driver.get("https://stackoverflow.com");
	}

	@And("^User clicks the Login button$")
	public void user_clicks_the_Login_button() throws Throwable {
		this.driver.findElement(By.xpath("//a[contains(concat(' ', normalize-space(@class), ' '), ' login-link btn-clear ')]")).click();
		//this.driver.findElement(By.xpath("html/body/header/div/ol/a[text()='Log In']"));
	}

	@And("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {		
		this.driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("autotestudemy@mail.com");
		
	}

	@And("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		this.driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("Password321!");
	}

	@When("^User click onto LogIn button$")
	public void user_click_onto_LogIn_button() throws Throwable {
		this.driver.findElement(By.xpath(".//*[@id='submit-button']")).click();
	}

	@Then("^User should be taken to the successfull login page$")
	public void user_should_be_taken_to_the_successfull_login_page() throws Throwable {
		System.out.println("6");
	}

}
