package com.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excel.excel_utility;

public class Login_Main {
	static WebDriver driver;
	excel_utility eu = new excel_utility();

	public Login_Main(WebDriver driver) {
		Login_Main.driver = driver;
	}

	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ananth\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public void url() {
		driver.get("https://www.naukri.com/");

		String windowTitle = getCurrentWindowTitle();
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

	// To close all the other windows except the main window.
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

	public void loginn() throws IOException {
		for (int i = 1; i <= 1; i++) {

			driver.findElement(By.xpath("//*[@id=\"login_Layer\"]/div")).click();
			driver.findElement(By.id("eLoginNew")).sendKeys(eu.excel_email(i));
			driver.findElement(By.id("pLogin")).sendKeys(eu.excel_password(i));
			driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
			WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]"));
			WebElement b = driver.findElement(By.xpath("/html/body/div[1]/div/div/ul[2]/li[2]/div/ul[2]/li[5]/a"));

			Actions act = new Actions(driver);
			act.moveToElement(a);
			act.moveToElement(b).click().build().perform();

		}
		driver.close();
	}
}
