package Tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuDynamicControlsTest extends BaseTest {
    @Test
    public void herokuDynamicControls() {
        herokuDynamicControlsPage.open();
        herokuDynamicControlsPage.clickButtonRemove();
        herokuDynamicControlsPage.isGoneWait();
        var isCheckboxExist = herokuDynamicControlsPage.isCheckboxExist();
        Assert.assertEquals(isCheckboxExist, false);
    }
}