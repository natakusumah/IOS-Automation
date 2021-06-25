package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;


public class ListPayment extends AbstrackObject {
    public ListPayment(IOSDriver<IOSElement> driver) {

        super(driver);
    }

    @iOSFindBy(id = "Total Payment")
    public IOSElement totalPayment;

    @iOSFindBy(id = "Mandiri Virtual Account")
    public IOSElement mandiriVirtualAccount;

    @iOSFindBy(id = "BCA Virtual Account")
    public IOSElement bcaVirtualAccount;

    @iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@text,'BNI Virtual Account')]")
    public IOSElement bniVirtualAccount;

    @iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@text,'BRIVA')]")
    public IOSElement BRIVA;

    @iOSFindBy(id = "Credit Card")
    public IOSElement cc;

    @iOSFindBy(xpath = "//XCUIElementTypeOther")
    public IOSElement ATMHeader;

    //*[@XCElementType='XCUIElementTypeCell']/[@XCElementType='XCUIElementTypeStaticText[@text='ATM']

    @iOSFindBy(xpath = "//XCUIElementTypeCell/XCUIElementTypeStaticText[contains(@text,'ATM')]")
    //*[@id='ATM']
    //*[@XCElementType='XCUIElementTypeStaticText[@text='ATM']
    public IOSElement ATM;

    @iOSFindBy(id ="Bank BCA")
    public IOSElement transferBCA;

    @iOSFindBy(id ="Bank Mandiri")
    public IOSElement transferMandiri;

    @iOSFindBy(id ="Alfamart")
    public IOSElement alfamart;

    @iOSFindBy(id="Indomaret")
    public IOSElement indomaret;

    @iOSFindBy(id = "CONTINUE")
    public IOSElement continuePay;

    @iOSFindBy(id = "PAY")
    public IOSElement pay;

    @iOSFindBy(id ="USE")
    public IOSElement TIX;

    @iOSFindBy(id ="alertAction1")
    public IOSElement confirmTIX;

    @iOSFindBy(id ="Pay with TIX Point")
    public IOSElement payTIX;

    @iOSFindBy(id ="PAY NOW")
    public IOSElement payNow;

    @iOSFindBy(id ="GO TO MY ORDER")
    public IOSElement goToMyOrder;

    @iOSFindBy(id = "Total Payment")
    public IOSElement price ;

    @iOSFindBy(id = "Important Information :")
    public IOSElement importantInfo ;

    @iOSFindBy(id ="OTHER PAYMENT METHOD")
    public IOSElement otherPaymentMethod;





}
