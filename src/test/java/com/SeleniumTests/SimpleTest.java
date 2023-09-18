package com.SeleniumTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleTest {
  @Test
  public void verifyTitle() {
	  ChromeOptions option = new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver = new ChromeDriver(option);
	  
	  driver.get("https://www.google.com/");
	  
	  String exptitle = "Google";
	  String acttitle = driver.getTitle();
	  
	  assertEquals(acttitle, exptitle);
	  
	  
  }
}
