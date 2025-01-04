package medium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://medium.com/");
	}
	@Test
	public void title()
	{
		String actualTitle=driver.getTitle(); 
		System.out.println(actualTitle);
	}

}