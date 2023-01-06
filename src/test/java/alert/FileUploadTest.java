package alert;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/kamur/IdeaProjects/demo/webdriver_java/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadFiles(),"chromedriver.exe","Uploaded file do not work!");
    }
}
