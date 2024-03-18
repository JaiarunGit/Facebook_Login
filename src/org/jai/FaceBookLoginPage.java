package org.jai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
		"C:\\selenium webdriver\\chromedriver-win64\\chromedriver.exe");

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Enter url
		driver.get("https://www.facebook.com/");

		// Find the user name
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("User_Name");

		// Find the user password
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("User_Password");

		// Find the Login Button
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

		// Verify if the login was successful by checking the title of the next page
		String expectedurl = "https://www.facebook.com/";

		String actualurl = driver.getCurrentUrl();

		if (expectedurl.equals(actualurl)) {
			System.out.println("Login successful - Test Passed!");
		}

		else {
			System.out.println("Login failed - Test Failed!");
		}

		// Close the browser
		driver.quit();
	}

}
