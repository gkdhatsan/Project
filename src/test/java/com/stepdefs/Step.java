package com.stepdefs;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {

	WebDriver driver;

	@Given("Open Browser")
	public void open_browser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@When("Perform Url")
	public void perform_url() {

		driver.get("https://adactinhotelapp.com/");

	}

	@Given("User Enter {string} and {string}")
	public void user_enter_and(String string, String string2) {
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(string);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(string2);
			
	}


	@When("Perform Login")
	public void perform_login() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();

	}

	@When("verify Login Error message {string}")
	public void verify_login_error_message(String string) {
		WebElement error = driver.findElement(By.xpath("//div[@class='auth_error']"));
		//String message = error.getText();
		String message = error.getText();
		Assert.assertEquals(string ,message);

	}

}
