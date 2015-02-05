import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriverConcurrencyTest {

    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = new InternetExplorerDriver();
        Thread.sleep(6000);
        driver.get("http://www.onliner.by/");
        Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(5000);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tut.by/");
        Thread.sleep(5000);
    }
}
