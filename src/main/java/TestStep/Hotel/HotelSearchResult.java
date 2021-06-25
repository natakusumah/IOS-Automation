package TestStep.Hotel;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class HotelSearchResult extends BaseFunction {

    @And("I use change date hotel")
    public void iUseChangeDateHotel() {

            objHotel.date.click();
            objHotel.nextMonth.click();
            randomDate();
            implicitWait(4);

    }

    @And("I select hotel")
    public void iSelectHotel() {
        implicitWait(2);
        objHotel.selectHotel.click();

    }


}
