package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HoversPage extends BaseModel {

    @FindBy(xpath = "//div[@class = 'example']/div[1]")
    private WebElement image1;

    @FindBy(xpath = "//div[@class = 'example']/div[2]")
    private WebElement image2;

    @FindBy(xpath = "//div[@class = 'example']/div[3]")
    private WebElement image3;

    public HoversPage(WebDriver driver) {
        super(driver);
    }
}
