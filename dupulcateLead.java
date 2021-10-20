package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dupulcateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("Vidhyam291@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement nameElement = driver.findElement(By.linkText("Vidhya"));
		String name = nameElement.getText();
		driver.findElement(By.linkText("18887")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Title not matched");
		}

		driver.findElement(By.name("submitButton")).click();

		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (firstName.equals(name)) {
			System.out.println("Name is same as duplicate lead name");
		} else {
			System.out.println("Name is different from duplicate lead name");
		}

	}

}