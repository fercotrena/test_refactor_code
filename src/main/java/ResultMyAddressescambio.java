import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;

public class ResultMyAddressescambio {

    public static String resultMyAddressescambio(){

        return driver.findElement(By.cssSelector(".page-subheading")).getText();
    }
}
