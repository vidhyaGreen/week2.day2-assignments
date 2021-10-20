package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assign3DeleteLead {

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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		driver.findElement(By.name("phoneNumber")).sendKeys("8939193073");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.linkText("17168")).click();
		driver.findElement(By.linkText("Delete")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys("17168");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text = findElement.getText();
		String str = "No records to display";
		if (str.equals(text)) {
			System.out.println("Record deleted");
		}

	}

}