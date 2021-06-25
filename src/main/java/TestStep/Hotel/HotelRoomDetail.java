package TestStep.Hotel;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;


public class HotelRoomDetail extends BaseFunction {

    @And("I select room")
    public void iSelectRoom() {
        implicitWait(1);
        objHotel.selectRoom.click();
        implicitWait(1);
        objHotel.chooseRoom.click();
        implicitWait(1);
        objHotel.bookNow.click();
        implicitWait(3);
        scrollTouch(1);
    }
}
