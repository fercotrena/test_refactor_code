import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.WebDriverSupliter.driver;
public class YourAddressescambio {

    public static void yourAddressescambio(String phone,String phone_mobile,String address,String company,String alias ){

/*
        En la vista "YOUR ADDRESSES", se actualizan los datos:
        phone, phone_mobile,address1,company y alias
         */


        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(phone);

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(address);

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(company);

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(alias );

        driver.findElement(By.cssSelector("#submitAddress > span")).click();





    }

}
