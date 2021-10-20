package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vidhya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("17168")).click();
		String str1 = driver.getTitle();
		String str2 = "View Lead | opentaps CRM";
		if (str1.equals(str2)) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not same");
		}
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Kyndryl");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String str3 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (str3.contains("Kyndryl")) {
			System.out.println("Company name is changed");
		} else {
			System.out.println("Company name is not changed");
		}
		driver.close();
	}

}




