package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Util.BaseConfig;
import com.Util.Highlighter;
import com.Util.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBMW {
	public void getDrive() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to(BaseConfig.getConfigValue("QA_URL"));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		FloridaPageFactory fpf = new FloridaPageFactory(driver);
		
		Highlighter.addColor(driver,fpf.getLogin());
		fpf.getLogin().click();
		Thread.sleep(1000);
		Highlighter.addColor(driver,fpf.getEmailfield());
		fpf.getEmailfield().sendKeys(BaseConfig.getConfigValue("email"));
		Highlighter.addColor(driver,fpf.getPassword());
		fpf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		Thread.sleep(1000);
		fpf.getSubmit().click();
		Screenshot.getScreenShot(driver, "BMW Homepage Screenshot");
		Thread.sleep(1000);
		
		if(fpf.getMyAccount().isDisplayed()) {
		System.out.println("Login Successful");
		}else {
			System.out.println("Login Failed");
		}
		
	}

}
