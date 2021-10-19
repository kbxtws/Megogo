import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class exam1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\ADiskF\\Ксюха\\WEB\\Tester_Bootcamp\\Tester\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://megogo.net/ru");
        try {
            driver.get("https://megogo.net/ru");
            Thread.sleep(2000);

            WebElement button = driver.findElement(By.className("svgicon-search-quick"));
            WebElement element = driver.findElement(By.name("q"));

            button.click();
            element.sendKeys("Моана", Keys.ENTER);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(20000);
            driver.quit();
        }


    }
}