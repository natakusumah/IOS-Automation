package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class Hotel extends AbstrackObject {
    public Hotel(IOSDriver<IOSElement> driver) {
        super(driver);
    }

    // Hotel Homepage
    @iOSFindBy(id = "SEARCH HOTELS")
    public IOSElement searchHotel;

    @iOSFindBy(id = "searchLabel")
    public IOSElement searchLocation;

    @iOSFindBy(xpath = "//*[@text='Staying Anywhere?']")
    public IOSElement staying;

    @iOSFindBy(xpath = "//XCUIElementTypeCell")
    public IOSElement chooseStaying;

    @iOSFindBy(id = "guestAndRoomLabel")
    public IOSElement roomAndGuest;

    @iOSFindBy(id = "dateCheckInLabel")
    public IOSElement dateCheckIn;

    @iOSFindBy(id = "dateCheckOutLabel")
    public IOSElement dateCheckOut;

    //Hotel search result
    @iOSFindBy(xpath = "//*[contains(@text,'hotelSearchResultTableViewCell')]")
    public IOSElement selectHotel;

    @iOSFindBy(id = "Date")
    public IOSElement date;

    @iOSFindBy(id = "calendarNextMonthButton")
    public IOSElement nextMonth;

    @iOSFindBy(id = "hotelRoomDetailSelectRoomButton")
    public IOSElement selectRoom;

    //Hotel room detail
    @iOSFindBy(xpath = "//*[contains(@text,'hotelRoomListTableViewCell')]")
    public IOSElement chooseRoom;

    @iOSFindBy(id = "hotelRoomDetailSelectRoomButton")
    public IOSElement bookNow;

    //Hotel booking form

    @iOSFindBy(id = "Enter contact details")
    public IOSElement enterContact;

    @iOSFindBy(id = "Name")
    public IOSElement Name;

    @iOSFindBy(id = "Title")
    public IOSElement titleGuest;

    @iOSFindBy(id = "Mr.")
    public IOSElement chooseTitle;

    // @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains[@text='Phone Number']")
    @iOSFindBy(id ="phone")
    public IOSElement phoneNumber;

    // @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[contains[@text='Email Address']")
    @iOSFindBy(id ="Email Address")
    public IOSElement guestEmail;

    @iOSFindBy(id ="SAVE")
    public IOSElement saveGuest;

    @iOSFindBy(id = "sameAsContactSwitch")
    public IOSElement sameAsContact;

    @iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeButton[contains(@text,'CONTINUE TO PAYMENT')]")
    public IOSElement continueToPayment;

    @iOSFindBy(id = "Continue")
    public IOSElement continueTrain;

    @iOSFindBy(id = "Name")
    public IOSElement name;

    @iOSFindBy(xpath = "//XCUIElementTypeCell[@text='CheckMrs.']")
    public IOSElement mrs;


    @iOSFindBy(id = "Title")
    public IOSElement title;

    @iOSFindBy(xpath = "//*[@text='Make special request?']")
    //*[@XCElementType='XCUIElementTypeTextView']
    public IOSElement makeSpecialRequest;

//    @iOSFindBy(id = "Special Request")
    @iOSFindBy(xpath = "//XCUIElementTypeTextView")
    public IOSElement specialRequest;

    @iOSFindBy(id = "SAVE")
    public IOSElement save;

}
