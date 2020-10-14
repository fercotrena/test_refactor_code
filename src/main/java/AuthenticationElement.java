import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.WebDriverSupliter.driver;

public class AuthenticationElement {

    public static WebElement EMAIL = driver.findElement(By.id("email"));
}
