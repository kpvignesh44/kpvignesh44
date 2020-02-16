package training;

import org.ajwcc.pduUtils.test.integration.AbstractTester.OutboundNotification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.smslib.modem.SerialModemGateway;

import com.google.common.util.concurrent.Service;

public class methodss {

	WebDriver driver;
	public void launchapp(String url)
	{System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleninum\\Driver\\chromedriver.exe");
	 

	 driver=new ChromeDriver();
	 
	driver.get(url);
	 
	 
	driver.manage().window().maximize();
	 
	}
	public void xpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
	public void login(String pat)
	{
		driver.findElement(By.xpath(pat)).click();
	}
public void actions(String a,String b)
{
	WebElement p = driver.findElement(By.xpath(a));
	WebElement q = driver.findElement(By.xpath(b));
	Actions bu = new Actions(driver);
	bu.moveToElement(p);
	bu.moveToElement(q).click().build().perform();
	
}
public void mobile(String valu)
{
	driver.findElement(By.xpath(valu)).sendKeys("605110");
}
public void check(String phones)
{
	driver.findElement(By.xpath(phones)).click();
}

public void nam(String ail,String email)
{
	driver.findElement(By.xpath(ail)).sendKeys(email);
}

public void contt(String ai)
{
	driver.findElement(By.xpath(ai)).click();
}




}
