import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateMyAddresses {



    @BeforeEach
    public void setUp() {
        WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateMyAddresses() {

        Authentication.login("maira.gon90@gmail.com", "santiago2015");
        MyAddressescambio.goToMyAddresses();
        YourAddressescambio.yourAddressescambio("351423232", "3513465959", "Santa fe", "dinosaurio", "FRCUTN");
        /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
        assertEquals("FRCUTN", ResultMyAddressescambio.resultMyAddressescambio());

    }
}
