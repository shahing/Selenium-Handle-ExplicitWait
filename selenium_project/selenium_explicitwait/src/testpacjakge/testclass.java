package testpacjakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

// Need to import these selenium libraries to handle explicit wait
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

import java.lang.String;
public class testclass {


public static void main (String args[])
{
	System.setProperty("webdriver.chrome.driver", "C:\\chromedrv\\chromedriver.exe");


	WebDriver driver = new ChromeDriver();

	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("btnK")).click();
	driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();


	//Handling the delay of loading the page via explicit wait
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement download_link;
	download_link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
	download_link.click();
	String strTitle = driver.getTitle();
	assertEquals(strTitle, "Downloads");
	System.out.print("test is Completed");
	driver.close();
	driver.quit();
}


}
