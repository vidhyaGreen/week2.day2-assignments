package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesForce {

	public static void main(String[] args) throws InterruptedException {
	
	//SET AND LOAD THE PATH:
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 
	//	 LOAD THE URL AND MAXIMISE:
	
		 
		 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		 driver.manage().window().maximize();
		 
		 
	//	 GET THE ALL FIELDS:
		 
		 Thread.sleep(3000);
		 
		  driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Vidhya");	
		  driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Madasamy");
		  driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("Vidhyam291@gmail.com");
	      driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("SBI CARDS AND PAYMENT SERVICES LIMITED");
          driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8939193073");
		 
		//HANDLE ALL THE DROP BOX:
		 
	       WebElement eleTitle=driver.findElement(By.name("UserTitle"));
	       Select dropDown1= new Select(eleTitle);
	       dropDown1.selectByIndex(5);
       
	//	handle all dropbox
	
		  WebElement eleEmployess=driver.findElement(By.id("CompanyEmployees"));
	      Select dropDown2= new Select(eleEmployess);
	      dropDown2.selectByValue("950");
		
		  WebElement eleCountry=driver.findElement(By.id("CompanyCountry"));
		  Select dropDown3= new Select(eleCountry);
		  dropDown3.selectByVisibleText("India");
		 
//		check the box
		 
	 driver.findElement(By.xpath("//class[@input='SubscriptionAgreement']")).click();
		 
	//CLOSE THE BROSWER
		 
	driver.close();
		 
		 
		 	 }      

}
