import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Handling_Dropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/?&tag=hydraamazonav-21&ref=pd_sl_1xb2hta1j6_e&adgrpid=187384300938&hvpone=&hvptwo=&hvadid=779257223991&hvpos=&hvnetw=g&hvrand=16022348130580326989&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9180695&hvtargid=kwd-11572600&hvcampaign=23073121122&hydadcr=13721_2323340_403268&mcid=8da36ddfe56437eebdff1326eb43509f&hvocijid=16022348130580326989--&hvexpln=nav&gad_source=1");
	
		
		
		/*Thread.sleep(10000);
		WebElement userName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
		
		userName.sendKeys("Tester");
		passWord.sendKeys("test");
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\screenshot\\screenshot.png"));
		WebElement login = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
		login.click();
		
		//File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		Thread.sleep(10000);
		System.out.print("test");
		WebElement order = driver.findElement(By.xpath("//*[@id=\"ctl00_menu\"]/li[3]/a"));
		order.click();
		Thread.sleep(10000);
		//6.dropdown select
		WebElement dropdownProduct =driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
		//Thread.sleep(10000);
		//dropdownProduct.click();
		dropdownProduct.sendKeys("ScreenSaver");
		//7.to print the dropdown value in console
		List<WebElement> value=dropdownProduct.findElements(By.tagName("option"));
		for(int i=0;i<=value.size();i++)
		{
			System.out.println("option value:"+value.get(i).getText());
		}
		Thread.sleep(100);
	}*/

	}
	}


