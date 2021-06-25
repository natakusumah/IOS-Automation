package PageObject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MainHomepage extends AbstrackObject {

 public MainHomepage(IOSDriver<IOSElement> driver) {
  super(driver);

 }
   // @iOSFindBy(id ="rightBarButtonItem")
   @iOSFindBy(id = "Home")
   public IOSElement home;


    @iOSFindBy(xpath ="//*[@text='LOG IN']")
    public IOSElement logIn;

    @iOSFindBy(id = "Email")
    public IOSElement email;

    @iOSFindBy(id = "Password")
    public IOSElement password;

    @iOSFindBy(id = "Account")
    public IOSElement account;

    @iOSFindBy(id = "Log Out")
    public IOSElement logOut;

    @iOSFindBy(id = "Log out")
    public IOSElement confirmLogOut;

    @iOSFindBy(id ="Flights")
    public IOSElement flight;

    @iOSFindBy(id ="Hotels")
    public IOSElement hotel;

    @iOSFindBy(id ="Trains")
    public IOSElement train;

    //@iOSFindBy(xpath = "//*[@text='Sewa Mobil']")
    @iOSFindBy(xpath ="//*[contains(@text,'Car') or (@text='Sewa Mobil')]")
    public MobileElement car;

    @iOSFindBy(id ="Attraction")
    public IOSElement atttraction;

    @iOSFindBy(id ="Events")
    public IOSElement event;

    @iOSFindBy(id = "icCloseButtonUserPopup")
    public IOSElement closeBanner;








}