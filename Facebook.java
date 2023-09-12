package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Edge Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Login functionality
		
		driver.findElement(By.name("email")).sendKeys("vb@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("vb@12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		
		//Create new account
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
		driver.findElement(By.name("lastname")).sendKeys("Badheka");
		driver.findElement(By.name("reg_email__")).sendKeys("vb@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vb@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vb@123@vb");
		WebElement day=driver.findElement(By.name("birthday_day"));
		day.click();
		day.sendKeys("13", Keys.ENTER);
		WebElement month=driver.findElement(By.name("birthday_month"));
		month.click();
		month.sendKeys("Feb", Keys.ENTER);
		WebElement year=driver .findElement(By.name("birthday_year"));
		year.click();
		year.sendKeys("1992", Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.name("sex"));
		list.get(1).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		driver.quit();
		
	}

}
