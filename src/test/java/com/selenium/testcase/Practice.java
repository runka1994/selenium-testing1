package com.selenium.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void testcase1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.thehindu.com/news/");
		driver.manage().window().maximize();
		driver.findElement(By.id("menu-button")).click();
		driver.findElement(By.xpath("//*[@id=\"popup-menu\"]/div[2]/div[1]/ul[3]/li[2]/ul/li[2]/a")).click();
		String actual= driver.findElement(By.xpath("/html/body/header/div[1]/div/div/nav[3]/div[1]/div[3]/h1")).getText();
		System.out.println("************************"+actual);
		assertEquals(actual, "Cricket News");
		Thread.sleep(2000);
		driver.close();
	}
	

}
