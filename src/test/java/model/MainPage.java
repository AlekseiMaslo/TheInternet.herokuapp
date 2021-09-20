package model;

import Utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseModel{

    @FindBy(xpath = "//a[text()= 'Hovers']")
    private WebElement hovers;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public HoversPage clickOnHoverMenuItem(){
        TestUtils.jsClick(getDriver(), hovers);

        return new HoversPage(getDriver());
    }
}
