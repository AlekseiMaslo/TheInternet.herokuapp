import base.BaseTest;
import model.HoversPage;
import model.MainPage;
import org.testng.annotations.Test;

public class EntityFunctionalAndUITest extends BaseTest {
    @Test
    public void testHover() {
        HoversPage hoversPage = new MainPage(getDriver()).clickOnHoverMenuItem();
    }
}
