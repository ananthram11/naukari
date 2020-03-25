package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.Excel_Operations;

public class retrievecontact_main {
	static WebDriver driver;
	public void launchChrome()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Ananth\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
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
	public void loginn() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		
		driver.findElement(By.id("eLoginNew")).sendKeys("tejaswini.m481@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("tejaswini@24");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}
	public void clickoncontactus() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/a/div")).click();
		Set<String>winHandles2=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,15000)");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[7]/a")).click();
		Set<String>winHandles3=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles3)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	}
	public void retrieve() {
		String ct=driver.findElement(By.xpath("//*[@id=\"natContact\"]/div[1]/div[1]/div[2]")).getText();
		Excel_Operations excel = new Excel_Operations();
		// writing into excelsheet
		excel.write_excel(0, 0, ct);
	}
}
