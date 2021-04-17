package MyMavenProject.Mymavenassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TrialCode {
   
	WebDriver driver;
	
	
	
	@Test
	public void First() throws InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files (x86)\\\\chromedriver.exe");
		driver.get("https://expensemanager.demo.vaadin.com/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement webElement = (WebElement) js.executeScript("return document.querySelector('expense-app').shadowRoot.querySelector(\"div\").querySelector('login-page').shadowRoot.querySelector('div')");
        WebElement username = webElement.findElement(By.name("username"));
        WebElement password = webElement.findElement(By.name("password"));
        WebElement loginBtn = webElement.findElement(By.tagName("vaadin-button"));
        //username.clear();
        //password.clear();
        username.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
        password.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));

        username.sendKeys("demo");
        password.sendKeys("demo");
        loginBtn.click();
        Thread.sleep(10000);
	}
}
