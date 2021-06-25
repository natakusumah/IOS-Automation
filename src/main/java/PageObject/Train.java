package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class Train extends AbstrackObject {
    public Train(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    //Train Homepage
    @iOSFindBy(id = "Search Trains")
    public IOSElement searchTrain;

    @iOSFindBy(id = "originTextField")
    public IOSElement from;

    @iOSFindBy(xpath = "//*[@XCElementType='XCUIElementTypeTextField']")
    public IOSElement searchCity;

    @iOSFindBy(xpath = "//*[@accessibilityLabel='trainStationListTableViewCell' and @onScreen='true']")
    public IOSElement selectDepart;

    @iOSFindBy(xpath = "//*[@accessibilityLabel='trainStationListTableViewCell' and @onScreen='true']")
    public IOSElement selectDestination;

    @iOSFindBy(id = "destinationTextField")
    public IOSElement to;

    @iOSFindBy(id = "Departure, Round Trip?")
    public IOSElement trip;

    // train search result
    @iOSFindBy(id = "CHANGE DATE")
    public IOSElement changeDate;

    //@iOSFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell and @onScreen='true'")
    @iOSFindBy(xpath = "//*[@XCElementType='XCUIElementTypeCell' and @onScreen='true']")
    public IOSElement selectTrain;

    // train booking form
    @iOSFindBy(id = "checkoutSwitch")
    public IOSElement sameAsContact;

    @iOSFindBy(id = "Save")
    public IOSElement savePassanger;

    @iOSFindBy(id = "Yes")
    public IOSElement confirmData;

    @iOSFindBy(id = "Continue")
    public IOSElement continueTrain;

    @iOSFindBy(id = "Select Seat")
    public IOSElement selectSeat;

    @iOSFindBy(xpath = "//*[contains(@text,'YES')]")
    public IOSElement insurance;

    @iOSFindBy(id="idCardSkyFloatingLabelTextField")
    public IOSElement ktp;

    @iOSFindBy(id="fullNameTextField")
    public IOSElement fullName;

    @iOSFindBy(id ="titleTextField")
    public IOSElement title;

    @iOSFindBy(id ="Done")
    public IOSElement chooseTitle;

    @iOSFindBy(id ="Pick Up Detail Locations")
    public IOSElement pickUpdetail;


    @iOSFindBy(id ="emailTextField")
    public IOSElement email;

    @iOSFindBy(id ="phoneNumberTextField")
    public IOSElement phoneNumber;

}
