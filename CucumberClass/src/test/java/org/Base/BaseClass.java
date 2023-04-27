package org.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static  WebDriver driver;
	public static Actions s;
	 static Robot r;
	
	public static void launchBrowser(String browserName) {
		if (browserName.equals("chrome"));
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver(); 
		
		
		 
		

			
			
		}
	
	public static void  launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		

	}
		

	

	public static void closeBrowser() {

		driver.close();
		
		
	}
	
	public static void browserMaximize() {
		driver.manage().window().maximize();

	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();

	}
	
	public static  void pageTitle() {
		
		String titleName=driver.getTitle();
		
		System.out.println("Title Name:  "+titleName);

	}
	
	public static void pageUrl() {
	 
		String url= driver.getCurrentUrl();
		
		System.out.println("Current page Url:"+url);
		

	}
	
	public static void launchUrl (String url) {

		
		driver.get(url);

	}
	
	public static void fillvalue(WebElement e, String value) {
		
		e.sendKeys(value);

	}
	
	
public static void fill(WebElement e, String value) {
	e.sendKeys(value);
}
	
	
	public static void btnClick(WebElement element) {
		
		element.click();
	}
	
	public static  void fillTextBox(WebElement e,String value ) {
		
		e.sendKeys(value);
		
		

	}
	public static  void dragDrop(WebElement start, WebElement end) {
		
		Actions s= new Actions(driver);
		
		s.dragAndDrop(start, end).perform();
	}
	
	
	public void clickDouble(WebElement element) {
		
		s=new Actions(driver);
		s.doubleClick(element).perform();
		
		

	}
	
	public static void copy() throws AWTException {
		
		
		 r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);   
		
		
	}
	
	public static  void dateAndTime() {
		Date d=new Date();
		System.out.println(d);

	}
	
	 public static  void paste() throws AWTException {
		 
		  r= new Robot();
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);   
			
		
	

	}
	
	
		
		
		
		

	
	
		
		

	
	                  

}
