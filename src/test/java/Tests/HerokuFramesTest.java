package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuFramesTest extends BaseTest {
    @Test
    public void herokuContext() {
        herokuFramesPage.open();
        herokuFramesPage.clickIFrame();
        herokuFramesPage.waitAlert();
        herokuFramesPage.closeNotificationAlert();
        herokuFramesPage.switchToFrameByIndex(0);
        var contentText = herokuFramesPage.getContextString();
        Assert.assertEquals(contentText, "Your content goes here.");
    }
}