package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverchrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\chromedriver_win32\\chromedriver.exe");
		
      WebDriver driver = new ChromeDriver();
      
      String baseUrl = "https://www.letskodeit.com";
      
    driver.get(baseUrl);      
	}

}
