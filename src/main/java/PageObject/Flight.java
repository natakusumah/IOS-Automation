package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class Flight extends AbstrackObject {

    public Flight(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    // Flight Homepage
    @iOSFindBy(id = "SEARCH FLIGHTS")
    public IOSElement searchFlight;

    @iOSFindBy(id = "originTextField")
    public IOSElement originFlight;

    @iOSFindBy(id = "destinationTextField")
    public IOSElement destinationFlight;

    @iOSFindBy(xpath = "//*[@text='Search city or airport']")
    public IOSElement searchOriginAirport;

    @iOSFindBy(xpath = "//*[@text='Going anywhere?']")
    public IOSElement searchDestinationAirport;

    @iOSFindBy(id = "airportSearchTableViewCell")
    public IOSElement selectLocation;

//    @iOSFindBy(className = "UIASwitch")
//    public IOSElement checkTrip;

    @iOSFindBy(id = "Departure, Roundtrip?")
    public IOSElement trip;

    //Flight Search Result

    @iOSFindBy(className = "UIASwitch")
    public IOSElement worryFreeFee;

    @iOSFindBy(id = "Date")
    public IOSElement date;

    @iOSFindBy(id = "Filter")
    public IOSElement filter;

    @iOSFindBy(id = "Airlines")
    public IOSElement airlines;

    @iOSFindBy(xpath = "//XCUIElementTypeCell[contains(@text,\"searchResultFilterCheckBox\")]/XCUIElementTypeStaticText[@text='Citilink Indonesia']")
    public IOSElement filterCitilink;


    @iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[@text='Citilink Indonesia']")
    public IOSElement selectCitilink;

    @iOSFindBy(id = "APPLY")
    public IOSElement apply;

    @iOSFindBy(id = "calendarNextMonthButton")
    public IOSElement nextMonthButton;

    @iOSFindBy(id = "icChevronDown")
    public IOSElement detailFlight;

    @iOSFindBy(id = "flightDetailBookNowButton")
    public IOSElement chooseFlight;

    //Flight Booking form

    @iOSFindBy(id = "sameAsContactSwitch")
    public IOSElement sameAsContact;


    @iOSFindBy(xpath = "//*[@accessibilityLabel='contactForm' and @top='true']")
    public IOSElement contactDetails;
    //*[@name='contactForm']
    //*[@accessibilityLabel='contactForm']

    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains[@text='Full Name']")
    public IOSElement nameGuest;

    @iOSFindBy(id = "Mr.")
    public IOSElement chooseTitle;

    @iOSFindBy(id="Nationality")
    public IOSElement nationality;

    @iOSFindBy(id="Indonesia")
    public IOSElement indonesia;

    @iOSFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeStaticText[@text='Indonesia']")
    public IOSElement chooseNationality;

    @iOSFindBy(id = "Enter contact details")
    public IOSElement enterContact;

    @iOSFindBy(id = "fullName")
    public IOSElement fullName;

    @iOSFindBy(id = "Title")
    public IOSElement titleGuest;

   // @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains[@text='Phone Number']")
    @iOSFindBy(id ="phone")
    public IOSElement phoneNumber;

   // @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains[@text='Email Address']")
   @iOSFindBy(id ="Email Address")
   public IOSElement guestEmail;

    @iOSFindBy(id ="SAVE")
    public IOSElement saveGuest;

    //*[@XCElementType='XCUIElementTypeOther']

    @iOSFindBy(id = "SAVE")
    public IOSElement savePassenger;

    @iOSFindBy(id = "continueToPaymentButton")
    public IOSElement continuePayment;

    @iOSFindBy(id = "Yes")
    public IOSElement confirmPayment;

    @iOSFindBy(id = "SEARCH FLIGHTS")
    public IOSElement tryAgain;

    @iOSFindBy(id = "BUY")
    public IOSElement buyBaggage;

    @iOSFindBy(xpath = "//*[contains(@text,'0kg')]")
    public IOSElement additionalBaggage;

    @iOSFindBy(xpath = "//*[contains(@text,'5kg')]")
    public IOSElement chooseBaggage;

    @iOSFindBy(id = "SAVE")
    public IOSElement saveBaggage;

    @iOSFindBy(xpath = "//*[contains(@text,'YES')]")
    public IOSElement insurance;

    @iOSFindBy(id = "Price has been updated")
    public IOSElement changePrice;

    @iOSFindBy(id = "OK")
    public IOSElement confirmChangePrice;

    @iOSFindBy(id = "Relax and take a breath")
    public IOSElement loading;

    @iOSFindBy(id ="RELOAD")
    public IOSElement reload;


}
