package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.facebook.com/");
		
		//WebElement email = driver.findElement(By.id("email"));
		//email.click();
		
		//WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		//email.sendKeys("vishal.singh7582@gmail.com");
		
		//WebElement login = driver.findElement(By.tagName("button"));
		 //WebElement login = driver.findElement(By.linkText("Places"));
		 //WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		//Password.click();
		
		//System.out.println("Hello");
		//Thread.sleep(2000);
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//String C = driver.getCurrentUrl();
		//System.out.println(C);
       
		//String T =  driver.getTitle();
		//System.out.println(T);
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//Dimension d = new Dimension(2000,2000);
		//driver.manage().window().setSize(d);
		
		//Point p = new Point(500,500);
	//	driver.manage().window().setPosition(p);
	//	Thread.sleep(3000);
	//	driver.quit();
		//TakeScreenshot ss  = (TakeScreenshot)driver;
		
		
	
		
	}

}
