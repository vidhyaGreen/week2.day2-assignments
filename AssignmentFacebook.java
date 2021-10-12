package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) throws InterruptedException {
		
		
// download the set path and launch:
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[(text()='Create New Account')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vidhya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vidhu"); 
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8939193073");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Test@123user");
		
	WebElement eleDate=driver.findElement(By.id("day"));
	Select dropDown1= new Select(eleDate);
    dropDown1.selectByIndex(21);
    
   WebElement eleMonth=driver.findElement(By.id("month"));
    Select dropDown2= new Select(eleMonth);
    dropDown2.selectByValue("8");
    
     WebElement eleYear=driver.findElement(By.id("year"));
    Select dropDown3= new Select(eleYear);
     dropDown3.selectByVisibleText("1992");
    
     driver.findElement(By.xpath("//input[@class='_58mt']")).click();

		
    
    
   
    	}

}
 