package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandling_Main {
	static WebDriver driver;

	//Launching the different browsers
    public void launchApplication(String browser) {
		
		try {
			//Firefox Browser
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Ananth\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\Ananth\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize(); //maximize the windows
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Waiting for 30 seconds
		
		} catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
}
    //opening website in the browser
	public void url()
	{
		driver.get("https://www.naukri.com/");
		String windowTitle= getCurrentWindowTitle();
		String mainWindow = getMainWindowHandle(driver);
		Assert.assertTrue(closeAllOtherWindows(mainWindow));
		Assert.assertTrue(windowTitle.contains("Jobs - Recruitment"));
	}
		
	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public String getCurrentWindowTitle() {
		String windowTitle = driver.getTitle();
		return windowTitle;
	}
	
	//To close all the other windows except the main window.
	public static boolean closeAllOtherWindows(String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}
	//login to the application
	public void loginn() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		
		driver.findElement(By.id("eLoginNew")).sendKeys("tejaswini.m481@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("tejaswini@24");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
}
	//Clicking on govtjob options
	public void clickongovtjobs() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/a/div")).click();
		Set<String>winHandles2=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"42\"]/h3")).click();
	}
	//Selecting the required option
	public void selectreqoption() {
		driver.findElement(By.xpath("//*[@id=\"tabJ-2\"]/ul/li[1]/a")).click();
		Set<String>winHandles2=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/section[1]/div[2]/div[3]/div[2]/div[1]/label/i")).click();
	}
	
}
