package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    /**
     * Provides path of file to the form then click Upload button
     * @param absolutePathOfFie The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFie){
        driver.findElement(inputField).sendKeys(absolutePathOfFie);
        clickUploadButton();
    }
    public String getUploadFiles(){
        return driver.findElement(uploadFiles).getText();
    }
}
