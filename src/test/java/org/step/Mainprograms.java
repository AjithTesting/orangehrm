package org.step;

import java.util.concurrent.TimeUnit;

import org.base.BaseClassCodings;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class Mainprograms  extends BaseClassCodings {
	@Given("my first method")
	public void my_first_method() throws InterruptedException {
		initiatebrowser("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	}
	@Given("login home page")
	public void login() throws InterruptedException {
	    WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign In')][1]"));
	    signIn.click();
	    Thread.sleep(2000);
	}
	@Given("login account")
	public void loginAccount() throws InterruptedException {
		//inspectById("email", "ABCabc@123gmail.com");
	//	inspectById("pass", "ABCabc@123");
		//clickById("send2");
		WebElement email = driver.findElement(By.id("email"));
	   email.sendKeys("ABCabc@123gmail.com");
	   WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys("ABCabc@123");
	   WebElement signIn = driver.findElement(By.id("send2"));
	   signIn.click();
	    Thread.sleep(2000);

	}
	@Given("searching")
	public void searching() throws InterruptedException{
	   WebElement search = driver.findElement(By.id("search"));
	   search.sendKeys("bag",Keys.ENTER);	    

	   WebElement bag = driver.findElement(By.xpath("(//a[@class='product-item-link'])[2]"));
	   scrollDown(bag);
       bag.click();	    

       WebElement addtocart = driver.findElement(By.xpath("//button[@title='Add to Cart']"));
       addtocart.click();
     Thread.sleep(3000);
       WebElement shopping = driver.findElement(By.xpath("//a[text()='shopping cart']"));
      shopping.click();	  

//	inspectById("NJG5FHJ","abc company");
   
      WebElement checkout = driver.findElement(By.xpath("//span[text()='Proceed to Checkout']"));
	checkout.click();	
	Thread.sleep(7000);
//	inspectByName("company","abcdefghi");  
//	inspectByName("street[0]","abc");
//	    inspectByName("city", "london");
//	    inspectByName("region_id", "California");
//	    inspectByName("postcode","00000");
//inspectByName("telephone","1234567890");
//clickByname("ko_unique_1");
//Thread.sleep(2000);
	clickByxpath("(//input[@type='radio'])[2]");
	Thread.sleep(2000);
	clickByxpath("//span[text()='Next']");
	

	}
	@Given("details")
	public void details() throws InterruptedException {
//clickByname("company");
System.out.println("exit");
		//selectByVisibleText("region_id", "California", num);Place Order
	}

	}

