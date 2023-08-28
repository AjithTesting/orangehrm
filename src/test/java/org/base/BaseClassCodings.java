package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCodings {
	public static WebDriver driver;
public static void initiatebrowser(String str)
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get(str);
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
}
public static void scrollDown(WebElement bag) {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)", bag);
}
public static void inspectById(String ID,String keys)
{
	WebElement findElement = driver.findElement(By.id(ID));
	findElement.sendKeys(keys);
}
public static void clickById(String ID)
{
	WebElement findElement = driver.findElement(By.id(ID));
	findElement.click();
}
public static void clickByname(String names)
{
	WebElement findElement = driver.findElement(By.name(names));
	findElement.click();
}
public static void clickByxpath(String xpath)
{
	WebElement findElement = driver.findElement(By.xpath(xpath));
	findElement.click();
}
public static void inspectByXpath(String xpath,String keys)
{
	WebElement findElement = driver.findElement(By.xpath(xpath));
	findElement.sendKeys(keys);
}
public static void inspectByName(String names,String keys)
{
	WebElement findElement = driver.findElement(By.name(names));
	findElement.sendKeys(keys);
}
public static void selectByVisibleText(String inspectstring,String textvalue,int num) {
	if(num==1) {
	WebElement names = driver.findElement(By.name(inspectstring));
	Select sel=new Select(names);
	sel.selectByVisibleText(textvalue);}
	
	
	
}
}









