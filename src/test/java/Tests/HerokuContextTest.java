package Tests;
import org.testng.annotations.Test;

public class HerokuContextTest extends BaseTest {
    @Test
    public void herokuContext() {
        herokuContextPage.open();
        herokuContextPage.rightClickOnPlace();
        herokuContextPage.closeAlert();
    }
}