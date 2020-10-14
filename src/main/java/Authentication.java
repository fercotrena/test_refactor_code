import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;
public class Authentication {


    /*Se inicia sesión en la aplicación*/
    public static void login(String email, String password){


     driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
     AuthenticationElement.EMAIL.sendKeys(email);
     driver.findElement(By.id("passwd")).sendKeys(password);
     driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

    }
}



