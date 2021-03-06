package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class About_Main {
	static WebDriver driver;
	public About_Main(WebDriver driver){
		About_Main.driver=driver;
	}
	//Launching the different browsers
    public void launchApplication(String browser) {
		
		try {
			//FireFox browser
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
	//opening website in browser
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
	// login in to the application
	public void loginn() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		
		driver.findElement(By.id("eLoginNew")).sendKeys("tejaswini.m481@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("tejaswini@24");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
}
	//scrolldown and opening about moadule 
	public void scrolldown() throws InterruptedException, IOException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/a/div")).click();
		//window handling
		Set<String>winHandles2=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,20000)");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[2]/a")).click();
		Set<String>winHandles3=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles3)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	    driver.findElement(By.xpath("//*[@id=\"btn1\"]")).click();
		
	}
	//taking screenshot of the about page
	public void TakeScreenshot() throws IOException, InterruptedException {
		Thread.sleep(4000);
		TakesScreenshot ts=((TakesScreenshot)driver);
		File Store=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Store,new File("C:\\Users\\hp\\Downloads\\NaukariProject (2)\\NaukariProject\\src\\test\\resources\\ScreenShot\\about.png"));
	}
}
