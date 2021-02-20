import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) throws Throwable 
	{
		
		
System.setProperty("webdriver.chrome.driver","D:\\chrome\\chromedriver.exe");


WebDriver driver = new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("testing");

Thread.sleep(10000);
List<WebElement> li =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));

                                                
System.out.println(li.size());

Thread.sleep(10000);
for(int i=0;i<li.size();i++)
	
{
	
	WebElement ele=li.get(i);
	
	System.out.println(ele.getText());
	
	if(ele.getText().equals("testing tools"))
		
	{
		ele.click();
		break;
		
	}
	
}




	}

}
