package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignmen3CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Vidhya");	
        driver.findElement(By.id("lastNameField")).sendKeys("Madasamy");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Vidhu");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
        driver.findElement(By.name("departmentName")).sendKeys("CS");
        driver.findElement(By.name("description")).sendKeys("Description Done");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Vidhyam291@gmail.com");
        WebElement eleState=driver.findElement(By.name("generalStateProvinceGeoId"));
        Select dropDown1= new Select(eleState);
        dropDown1.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
	     driver.findElement(By.linkText("Edit")).click();
	     
	//	 * 17. Clear the Description Field using .clear
    
	     driver.findElement(By.name("description")).clear();
	     
	    driver.findElement(By.name("importantNote")).sendKeys("Very important");
	    driver.findElement(By.name("submitButton")).click();

	//	 * 20. Get the Title of Resulting Page.

	    System.out.println(driver.getTitle());
 		 System.out.println( " The Title of the web page is: " + driver.getTitle());


	}

}
