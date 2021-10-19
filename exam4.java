import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class exam4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ADiskF\\Ксюха\\WEB\\Tester_Bootcamp\\Tester\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

        try {
            driver.get("https://megogo.net/ru");
            Thread.sleep(2000);

            WebElement button = driver.findElement(By.className("svgicon-search-quick"));
            WebElement search = driver.findElement(By.name("q"));
            WebElement close = driver.findElement(By.xpath("//button[@type='reset']"));

            button.click();
            search.sendKeys("Моана");
            close.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit();
        }
    }
}