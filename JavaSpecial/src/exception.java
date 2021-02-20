import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exception {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	List<WebElement> drop	=driver.findElements(By.id("sss"));
	

	for(WebElement ele:drop)
	{
		ele.click();
		break;
		
		
	}
	
}
}