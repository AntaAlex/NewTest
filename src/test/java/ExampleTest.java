
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.lanit.edu.YandexSearchPage;

public class ExampleTest {

    private WebDriver driver;
    private YandexSearchPage ya;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ya.ru");
        ya = new YandexSearchPage(driver);

    }
    @Test
    public void smokeTest(){
        ya.doesInput();
    }


    @Test
    public void firstTest() throws InterruptedException {
        ya.searchFor();
        Thread.sleep(1500);
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("text=shiki"));
        driver.quit();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}