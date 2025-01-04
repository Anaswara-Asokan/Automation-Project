package medium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://medium.com/");
	}
	@Test
	public void alertHand()
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div[3]/div/div[5]/div/span/button")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		
	}
	

}
