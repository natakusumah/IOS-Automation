package TestStep.Hotel;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class HotelHomepage extends BaseFunction {


    @And("I search hotel")
    public void iSearchHotel() {
        objHotel.searchHotel.click();
        implicitWait(4);
    }

    @And("I choose hotel location {string}")
    public void iChooseHotelLocation(String staying) {
        objHotel.searchLocation.click();
        objHotel.staying.click();
        objHotel.staying.sendKeys(staying);
        objHotel.chooseStaying.click();
    }
}