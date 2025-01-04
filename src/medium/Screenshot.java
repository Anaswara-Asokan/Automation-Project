package medium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	ChromeDriver driver;
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://medium.com/");
	}
	@Test
	public void sreenShot() throws IOException
	{
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File("C:\\Users\\Prasil\\Desktop\\imagesScreen.png"));
	}
	

}
