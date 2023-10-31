package hooks;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {
    @Before
    public void setup(){
        System.out.println("Before çalıştı");
    }

    @After
    public void tearDown(Scenario scenario){

        System.out.println("After çalıştı");
        final byte[] failedScreenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(failedScreenshot, "image/png", "failed_screenshot"+scenario.getName());

            Driver.closeDriver();

        }
    }
}
