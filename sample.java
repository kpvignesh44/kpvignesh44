package tsting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1220\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
		 

		 WebDriver driver=new ChromeDriver();
		 driver.get("https://github.com/kpvignesh44/kpvignesh44/blob/master/methodss.java");
	}

}
