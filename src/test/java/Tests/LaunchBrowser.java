package Tests;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	WebDriver driver;
	

@Test
public void launch() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://google.com");
	
	driver.manage().window().maximize();
	System.out.println(" Launched Browser");
	
	
	
	
}
	

}
