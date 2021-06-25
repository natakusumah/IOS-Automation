package PageObject;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InstructionPay extends AbstrackObject {
    public InstructionPay(IOSDriver <IOSElement> driver) {
        super(driver);
    }

    @iOSFindBy(id = "I HAVE COMPLETED PAYMENT")
    public IOSElement AlreadyPayment ;

    @iOSFindBy(id = "GO TO MY ORDER")
    public IOSElement GoToMyOrder ;

// Transfer bank

    @iOSFindBy(id = "Total Payment")
    public IOSElement totalPayment ;


    @iOSFindBy(id = "OK")
    public IOSElement ok ;



}
