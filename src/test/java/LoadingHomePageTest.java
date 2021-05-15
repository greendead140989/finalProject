import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class LoadingHomePageTest extends BaseTest {
    @Test
    public void loadingHomePage() {
        HomePage homePage = new HomePage(driver);
        WebElement logo = homePage.getLogo();
        Assert.assertTrue(logo.isEnabled(),"Logo on HomePage is not loaded");
    }
}
