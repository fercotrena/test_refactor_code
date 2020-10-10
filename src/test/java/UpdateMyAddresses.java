import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddress() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        /*Se inicia sesión en la aplicación*/
        driver.findElement(By.id("email")).sendKeys("fernandocotrena@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("admin123456");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();

        /*Se accede a la vista a la opcion MY ADDRESSES y luego a la opcion Update*/
        driver.findElement(By.cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".address_update .icon-chevron-right")).click();


        /*
           En la vista "YOUR ADDRESSES", se actualizan los datos:
            phone, phone_mobile,address1,company y alias
         */
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("123456789");

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys("987654321");

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("Street 443");

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys("UTN");

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys("UTN AUTOMATION");

        driver.findElement(By.cssSelector("#submitAddress > span")).click();

        /*Se valida el cambio realizado  comparando el valor del alias actualizado*/
        assertEquals("UTN AUTOMATION", driver.findElement(By.cssSelector(".page-subheading")).getText());
    }

}
