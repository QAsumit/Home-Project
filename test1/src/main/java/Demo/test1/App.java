package Demo.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://cppilotproject.com/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/ul/li[2]/a")).click();
    	driver.findElement(By.id("email")).sendKeys("sumit@commercepundit");
    	driver.findElement(By.id("pass")).sendKeys("test123");
    	driver.findElement(By.id("send2")).click();
    	
    	
        
    	
    	
    	
    }
}
