package PageObject;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class Car extends AbstrackObject {
    public Car(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    //car homepage


    @iOSFindBy(id = "Search Cars")
    public IOSElement searchCar;

    @iOSFindBy(id = "pickUpLocationTextField")
    public IOSElement pickUp;

    @iOSFindBy(xpath = "//*[@text='Going Anywhere?']")
    public IOSElement location;

    @iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText")
    public IOSElement selectLocation;

    @iOSFindBy(id = "durationPicker")
    public IOSElement duration;

    @iOSFindBy(id = "numberOfCarPicker")
    public IOSElement numberOfCar;

    // car search result
    @iOSFindBy(xpath = "//*[@XCElementType='XCUIElementTypeCell']")
    public IOSElement selectCar;

    @iOSFindBy(id = "Booking Now")
    public IOSElement bookingNow;

    // car booking form
    @iOSFindBy(className = "XCUIElementTypeTextView")
    public IOSElement pickUpDetailLocations;

    @iOSFindBy(xpath = "//*[@text='Pick Up Detail Locations']")
    public IOSElement pickupDetail;

    //*[@id='Register or Login']

    @iOSFindBy(id="Register or Login")
    public IOSElement registerLogin;

    @iOSFindBy(id="fullNameTextField")
    public IOSElement fullName;

    @iOSFindBy(id ="titleTextField")
    public IOSElement title;

    @iOSFindBy(id ="Done")
    public IOSElement chooseTitle;

    @iOSFindBy(id ="emailTextField")
    public IOSElement email;

    @iOSFindBy(id ="phoneNumberTextField")
    public IOSElement phoneNumber;

    @iOSFindBy(id ="Return")
    public IOSElement closeKeyboard;

    //*[@id='Return']

    @iOSFindBy(id = "Continue")
    public IOSElement continueCar;

    @iOSFindBy(id = "Yes")
    public IOSElement confirmCar;

    //*[@id='Your request is in progress Please wait...']



    //*[@XCElementType='XCUIElementTypeTextView']


}
