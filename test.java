import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test {
    WebDriver driver;
    WebElement button;
    WebElement search;
    WebElement film;
    WebElement close;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "F:\\ADiskF\\Ксюха\\WEB\\Tester_Bootcamp\\Tester\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://megogo.net/ru");
        button = driver.findElement(By.className("svgicon-search-quick"));
        button.click();
    }

    @Test
    public void exam1(){
        search = driver.findElement(By.name("q"));

        button.click();
        search.sendKeys("Моана", Keys.ENTER);

        film = (new WebDriverWait(driver, Duration.ofSeconds(18)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Моана']"))));

        Assert.assertTrue(film.isDisplayed());
    }

    @Test
    public void exam2(){
        search = driver.findElement(By.name("q"));

        button.click();
        search.sendKeys("Моана");

        film = (new WebDriverWait(driver, Duration.ofSeconds(18)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Моана']"))));

        Assert.assertTrue(film.isDisplayed());
    }

    @Test
    public void exam3(){
        search = driver.findElement(By.name("q"));

        button.click();
        search.sendKeys("Моана", Keys.ENTER);

        film = (new WebDriverWait(driver, Duration.ofSeconds(18)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Моана']"))));
        film.click();

        Assert.assertTrue(film.isDisplayed());

    }

    @Test
    public void exam4(){
        search = driver.findElement(By.name("q"));

        button.click();
        search.sendKeys("Моана");

        film = (new WebDriverWait(driver, Duration.ofSeconds(18)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title = 'Моана']"))));
        film.click();

        Assert.assertTrue(film.isDisplayed());
    }

    @Test
    public void exam5(){
        search = driver.findElement(By.name("q"));
        close = driver.findElement(By.xpath("//button[@type='reset']"));

        button.click();
        search.sendKeys("Моана");
        close.click();
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }
}