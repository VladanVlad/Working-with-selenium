package doin.da.work;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fillingoutSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.techlistic.com/p/selenium-practice-form.html");
		wd.findElement(By.name("firstname")).sendKeys("Vladan");
		wd.findElement(By.name("lastname")).sendKeys("Vladisavljevic");
		wd.findElement(By.id("sex-0")).click();
		wd.findElement(By.id("exp-1")).click();
		wd.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("26.03.2020");
		wd.findElement(By.cssSelector("input[id=profession-0")).click();
		wd.findElement(By.xpath("//input[@id='tool-2']")).click();
		
		Select drpContinent = new Select(wd.findElement(By.id("continents")));
		drpContinent.selectByVisibleText("Europe");
		
		wd.findElement(By.xpath("//option[contains(text(),'Navigation Commands')]")).click();
		WebElement we = wd.findElement(By.xpath("//input[@id='photo']"));
		we.sendKeys("E:\\chromedriver_win32\\chromedriver.exe");
		wd.findElement(By.name("Open")).click();
		sacekaj();
		wd.findElement(By.xpath("//button[@id='submit']")).click();
		
	}
	
	public static void sacekaj() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
