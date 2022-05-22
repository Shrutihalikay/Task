package Launch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class browser {
	private static final String driver = null;
	private static final String ActualReleaseDate = null;
	public static void main(String[] args) throws Throwable {

		//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C://Selenium-java browserstack//chromedriver_win32//chromedriver.exe");

		//Creating an object of ChromeDriver
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.navigate().to("https://www.chrome.com/");
       //driver.findElement(By.name("q")).sendKeys("pushpa full movie imdb page");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).sendKeys("pushpa full movie imdb page");			
		driver.findElement(By.id("@//sb_form_go id")).click();
		driver.findElement(By.xpath("input//*[@id=\"b_results\"]/li[3]/div/div/h2/a")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/div/div[2]/input")).sendKeys("pushpa full movie wiki page");
        driver.findElement(By.xpath("input//*[@id=\"tsf\"]/div[1]/div[1]/div[2]/button/div/span/svg/path)")).click();
        driver.findElement(By.xpath("input//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")).click();
	    driver.findElement(By.id("bpage")).click();
	}
	
		@Test
		public void verifyReleaseDate()
		{
		String ActualReleaseDate = "seventeen december two thousend twenty two";
		String ExpectedReleaseDate = "seventeen december two thousend twenty two";
		Assert.assertEquals("ActualReleaseDate","ExpectedReleaseDate");
		System.out.println( "Assert passed");
		}
	
		@Test
		public void verifyCountry()
		{
		String ActualCountry = "India";
		String ExpectedCountry = "India";
		Assert.assertEquals("ActualReleaseDate","ExpectedReleaseDate");
		System.out.println( "Assert passed");
		}
		
		@AfterTest
		public void closedriver1()
		{
		
		}
		//closes the browser instance
			
		private Object getText() {
			// TODO Auto-generated method stub
			return null;
		}
		private void closedriver() {
			// TODO Auto-generated method stub
			
		}
}









