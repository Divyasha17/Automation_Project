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
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
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


