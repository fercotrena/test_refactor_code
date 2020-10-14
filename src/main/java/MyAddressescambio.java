import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;
import static utils.WebDriverSupliter.driver;
public class MyAddressescambio {

    public static void goToMyAddresses() {
        /*Se accede a la vista a la opcion MY ADDRESSES y luego a la opcion Update*/


        driver.findElement(By.cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".address_update .icon-chevron-right")).click();



    }
    }


