package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_ClickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();

        String text = "TAU rocks!";
        alertPage. alert_setInput(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You entered: " + text,"Result text incorrect");
    }
}
