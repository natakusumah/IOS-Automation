package BaseClass;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.*;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class BaseSetUp {

    public static IOSDriver<IOSElement> driver ;
    public static final String ENG_REPOSITORY= "PageObject/ENG_Object/";
    public static final String IND_REPOSITORY= "PageObject/IND_Object/";
    private static DesiredCapabilities dc = new DesiredCapabilities();
    private static String baseEnv;
    public static String sprint;

    public static void setUp() throws IOException, InterruptedException {
        loadProperties();
        System.out.println("check "+ baseEnv);
        String reportDirectory = "reports";
        dc.setCapability("reportDirectory", reportDirectory);
        String reportFormat = "xml";
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName","test");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, baseEnv);
        driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        dc.setCapability("automationName", "XCUITest");
        dc.setCapability("platformName","iOS");
        dc.setCapability("autoWebView", true);
        dc.setCapability("noReset", true);
        driver.setLogLevel(Level.INFO);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    private static void loadProperties() {
        Properties properties = new Properties();
        InputStream inputStream = null;

        try {
            properties.load(new FileInputStream("src/main/resources/TestData/config.properties"));
            baseEnv = properties.getProperty("BaseEnv");
            sprint = properties.getProperty("Sprint");


        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }


    public static void teardown()  {
        driver.closeApp();
        driver.launchApp();
    }
}