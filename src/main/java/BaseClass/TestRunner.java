package BaseClass;
import com.google.common.io.Files;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

@CucumberOptions(


        glue = "TestStep",
        features = "src/test/java/Scenario/",
        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },
//        plugin = {"json:target/cucumber-report/cucumber.json"},
        //plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
//        plugin = { "pretty",
//                "html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt" },

        tags = {"@TrainGuestCompleteBooking"}
)

public class TestRunner extends AbstractTestNGCucumberTests {


    @BeforeSuite(alwaysRun = true)
    public void setUpp() throws Exception {
     BaseSetUp.setUp();
    }

    @AfterMethod(alwaysRun = true)
    public static void tearDownr(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            File imageFile = ((TakesScreenshot) BaseSetUp.driver).getScreenshotAs(OutputType.FILE);
            String failureImageFileName = result.getMethod().getDescription()
                    + new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
            File failureImageFile = new File(System.getProperty("user.dir") + "//target/cucumber-html-reports/Fail screenshots/Fail " + failureImageFileName);
            failureImageFile.getParentFile().mkdir();
            failureImageFile.createNewFile();
            Files.copy(imageFile, failureImageFile);
        }

    }

    @AfterMethod(alwaysRun = true)
    public static void afterMethod() {

        BaseSetUp.teardown();
    }


    @AfterSuite(alwaysRun = true)
    public static void quit() {
        ReportConfig.generateCucumberReport();
        BaseSetUp.driver.closeApp();
        BaseSetUp.driver.quit();
    }

}




