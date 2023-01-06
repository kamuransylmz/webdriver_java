package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void rightClickContextMenu(){
        var contextMenuPage = homePage.right_clickContextMenu();
        contextMenuPage.clickHotSpot();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu","not selected alert text!");

    }
}
