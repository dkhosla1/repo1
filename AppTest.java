package Group1.Artifact1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest
{
	@Test 
    public void login(){
        System.out.println( "Logging into an account" );
        System.setProperty("webdriver.chrome.driver", "/Users/deepakkhosla/documents/chromedriver");;
        WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.woodestate.in");
    }
}
