import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic2 {

	public static void main(String[] args) throws Throwable 
	{
		
		
System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");


WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("testing");


	}

}
