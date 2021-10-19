import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class exam3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ADiskF\\Ксюха\\WEB\\Tester_Bootcamp\\Tester\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://megogo.net/ru");
            Thread.sleep(2000);

            WebElement button = driver.findElement(By.className("svgicon-search-quick"));
            WebElement element = driver.findElement(By.name("q"));

            button.click();
            element.sendKeys("Моана");

            WebElement film = (new WebDriverWait(driver, Duration.ofSeconds(18)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Моана']"))));

            film.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            Thread.sleep(20000);
            driver.quit();
        }
    }
}