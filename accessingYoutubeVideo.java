package doin.da.work;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class accessingYoutubeVideo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		wd.get("https://www.youtube.com/");
		wd.findElement(By.id("search")).sendKeys("Rick Astley");
		wd.findElement(By.id("search")).sendKeys(Keys.ENTER);
		sacekaj(1000);
		wd.findElement(By.xpath(
				"//yt-formatted-string[@class='style-scope ytd-video-renderer'][contains(text(),'Rick Astley - Never Gonna Give You Up (Video)')]"))
				.click();
		int numOfTries = 0;
		WebElement we = null;
		System.out.println("otvorio stranu");
		while (true) {
			try {
				we = wd.findElement(By.xpath("//div[@id='ad-text:t']"));
			} catch (Exception e) {
			}
			if (we != null) {
				we.click();
				break;
			}
			if (numOfTries > 14)
				break;
			sacekaj(500);
			numOfTries++;
		System.out.println("Cekam da se reklama zavrsi " + numOfTries);
		}
		System.out.println("Zavrseno cekanje reklame");
		List<WebElement> wes = null;
		try {
			we = wd.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[4]/div[2]/div/div[3]/ytd-watch-next-secondary-results-renderer/div[2]/ytd-compact-video-renderer[1]/div[1]/div/div[1]/a"));
			//wes = wd.findElements(By.className("yt-simple-endpoint style-scope ytd-compact-video-renderer"));
		} catch (Exception e) {
			System.out.println("Nisam nasao xpath");
		} 
			sacekaj(10000);
			we.click();
			System.out.println("Kraj programa");
	}

	public static void sacekaj(int numOfMSec) {
		try {
			Thread.sleep(numOfMSec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
