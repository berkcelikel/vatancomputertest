package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        tags = "@Regression or @Smoke",
        features = {"src/test/java/FeatureFiles/"},
        glue = {"StepDefinitions"}
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class vatancomputerRunner extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Tested By", "Berk Celikel");
        ExtentService.getInstance().setSystemInfo("Application Name", "vatancomputertest");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
    }


}
