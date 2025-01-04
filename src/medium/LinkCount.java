package medium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://medium.com/");
	}
	@Test
	public void LinkNo()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a")); 
		System.out.println("Total no of links="+linkDetails.size());
	}

}
