import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.lanit.edu.YaSearchPage;
import ru.lanit.edu.YandexSearchPage;

public class ExampleTest {

    private WebDriver driver;
    private YandexSearchPage ya;
    private YaSearchPage yandex;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        ya = new YandexSearchPage(driver);
        yandex = new YaSearchPage(driver);

    }

    @Test
    public void smokeTest() {
        driver.get("https://ya.ru");
        ya.searchArrow.doesInput();
    }


    @Test
    public void firstTest() throws InterruptedException {
        driver.get("https://yandex.ru");
            ya
            .searchFor("hello")
            .iCanGoHome();
       /* String query = "hello";
        yandex.searchArrow.searchFor(query);
        Thread.sleep(1500);
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(query));*/
        driver.quit();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}