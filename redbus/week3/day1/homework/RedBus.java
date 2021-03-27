package redbus.week3.day1.homework;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// 1.Go to https://www.redbus.in/ in chrome 
		driver.get(" https://www.redbus.in/");
		//2.Type C in the FROM text box
		WebElement element = driver.findElement(By.id("src"));
		element.sendKeys("c");
		Thread.sleep(3000);
		//3.Choose the second option and ENTER 
		String ss=Keys.chord(Keys.DOWN,Keys.TAB);
		element.sendKeys(ss);
		//4.Type in the Destination text box
		WebElement element2 = driver.findElement(By.id("dest"));
		element2.sendKeys("B");
		Thread.sleep(3000);
		//5.Choose the first option and TAB
		String s =Keys.chord(Keys.ENTER);
		element2.sendKeys(s);
		//6.Choose the first date in April 
		driver.findElement(By.xpath("//span[@class= 'fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[@class = 'next']/button")).click();
		//7.Choose the first option and TAB 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr[@class='rb-monthHeader']/following::tr/following::tr/td[(text()='1')]")).click();
		//8.Click Search Buses
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class= 'icon icon-close c-fs']")).click();
		//9.Print the number of search  results
		System.out.println("The number of buses from chennai to bangalore:" + driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText());
		//10.Choose only Sleeper Bus
		driver.findElement(By.xpath("//li[@class='checkbox']/input[@id = 'bt_SLEEPER']/following-sibling::label[1]")).click();
		//11.Print the number of search results
		System.out.println("The total number of sleeper buses are" + driver.findElement(By.xpath("//span[@class = 'f-bold busFound']")).getText());
		//12.Choose also AC buses
		driver.findElement(By.xpath("//label[text()='SLEEPER']/following::label[@class='custom-checkbox'][1]")).click();
		//13.Print the number of search results 
		System.out.println("The total number of AC+sleeper buses are:" + driver.findElement(By.xpath("//span[@class = 'f-bold busFound']")).getText());
		// 14.Find the Bus name that is costliest in the result shown
		System.out.println("The costliest Bus name is:" +driver.findElement(By.xpath("//div[@class ='column-two p-right-10 w-30 fl']/div[contains(text(),'GreenLine Travels And  Holidays')]")).getText());


	}

}
