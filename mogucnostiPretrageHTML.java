package vezba_0326;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mogucnostiPretrageHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(wd, 3);
		WebElement elem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		elem.sendKeys("safgad");
		 wd.get("https://shop.demoqa.com/my-account/");
		 wd.findElement(By.id("username")).sendKeys("Vladan");
		 wd.findElement(By.name("password")).sendKeys("mypassword");
		 wd.findElement(By.cssSelector("input#password")).sendKeys("sifra123");
		 //"input.nazivKlase" //tag[atribut=vrednost]" //"input[name=vrednost]" /*
		 // "//input[@id='username']"; "//tag[@atribut='vrednost']";
		 wd.findElement(By.xpath("//input[2][@type='text']"));
		 wd.findElement(By.xpath("//input[@id='username']")).sendKeys("Pera");;
		 wd.findElement(By.name("login")).click(); sacekaj();
		 wd.get("https://shop.demoqa.com/");
		 wd.findElement(By.partialLinkText("Sear")).click();
		 wd.findElement(By.className("form-control")).sendKeys("dress"); 
		 wd.findElement(By.className("form-control")).sendKeys(Keys.ENTER);
		 
		wd.navigate().to("https://shop.demoqa.com/product/black-ribbed-short-sleeve-lettuce-hem-midi-dress/");

		List<WebElement> slike = wd.findElements(By.className("noo-woo-thumbnails__image"));

		for (int i = 0; i < slike.size(); i++) {
			slike.get(i).click();
			sacekaj();

		}
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
