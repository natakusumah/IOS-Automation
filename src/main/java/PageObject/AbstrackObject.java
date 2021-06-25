package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;



public abstract class AbstrackObject  {

    public static IOSDriver<IOSElement> driver;



    public AbstrackObject(IOSDriver<IOSElement> driver) {

            AbstrackObject.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);


        }


    }






