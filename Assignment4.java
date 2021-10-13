package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		//SET AND LOAD THE PATH:
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 
	//	 LOAD THE URL AND MAXIMISE:
	
		 
		 driver.get("https://acme-test.uipath.com/login");
		 driver.manage().window().maximize(); 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 
  //Get the title of the page and print 
		 
		 System.out.println(driver.getTitle());
		 System.out.println( " The Title of the web page is: " + driver.getTitle());
		 
	 

//logout and close
		 
		 driver.findElement(By.xpath("//a[(text()='Log Out')]")).click();
		 driver.close();

	}	     

}
