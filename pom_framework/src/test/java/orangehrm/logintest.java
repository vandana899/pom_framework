package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {
	 public static void main(String[] args) throws InterruptedException {
		 String url= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		         
		         WebDriver driver;
		         
		         WebDriverManager.chromedriver().setup();
		         driver = new ChromeDriver();
		         driver.get(url);
		         Thread.sleep(5000);
//		       loginpage2 obj=new loginpage2(driver);
//		       obj.enterusername("Admin");
//		       obj.enterpassword("admin123");
//		       obj.click();
		         login obj=new login(driver);
		         obj.enterusername("Admin");
		         obj.enterpassword("admin123");
		         obj.click();
		     }

}
