package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Advancesearch_Main {
	static WebDriver driver;
	public Advancesearch_Main(WebDriver driver) {
		Advancesearch_Main.driver=driver;
	}
	//Launching the different browsers
     public void launchApplication(String browser) {
		
		try {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","D:\\Ananth\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","D:\\Ananth\\chromedriver_win32 (1)\\chromedriver.exe");
				driver=new ChromeDriver();

			}

			driver.manage().window().maximize(); //maximize the windows
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //Waiting for 30 seconds
		
		} catch (WebDriverException e) {
			System.out.println(" browser could not be launched");
		}
}
	//Launching website in browser
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
	//Login in to the application
	public void loginn() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
		
		
		driver.findElement(By.id("eLoginNew")).sendKeys("tejaswini.m481@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("tejaswini@24");
		driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
	}
	//clicking on advance search 
	public void clickonadvancesearch() {
		WebElement a =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/a/div"));
		WebElement b =driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[1]/li[1]/div/ul[1]/li[3]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(a);
		act.moveToElement(b).click().build().perform();
		Set<String>winHandles2=driver.getWindowHandles();
		 
	    for(String winHandle:winHandles2)
	    {
	    	driver.switchTo().window(winHandle);
	    	
	    }
	}
	//Entering required details for advance search
	public void  enterdata() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"advKeyskills\"]/div[1]/div[2]/input")).sendKeys("Javadevloper");
		driver.findElement(By.xpath("//*[@id=\"Sug_advLocation\"]")).sendKeys("Hydrabad");
		driver.findElement(By.xpath("//*[@id=\"dd_adv_workExp_year\"]/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"dd_cja_expyr3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dd_adv_workExp_month\"]/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"dd_cja_expmn6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"dd_adv_exp_min\"]/div[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"dd_cja_min7\"]")).click();
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"ddAdvIndusrty\"]/div[1]/ul/li/div/input")).click();
		WebElement c =driver.findElement(By.xpath("//*[@id=\"ul_ddAdvIndusrty\"]/div/div[1]/ul/li[22]/a"));
		act.moveToElement(c).click().build().perform();
		driver.findElement(By.xpath("/html/body")).click();
		driver.findElement(By.xpath("//*[@id=\"adv_jobCategory\"]")).click();
		WebElement d =driver.findElement(By.xpath("//*[@id=\"24\"]"));
		act.moveToElement(d).click().build().perform();
		driver.findElement(By.xpath("//*[@id=\"advFrm\"]/div[7]/div[2]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"advFrm\"]/div[8]/div[2]/div/div[2]/a")).click();
	}
	//Clicking on advance search button
	public void advancesearch() {
		driver.findElement(By.xpath("//*[@id=\"adv_submit\"]")).click();
	}
}
