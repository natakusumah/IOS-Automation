package TestStep.Car;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;



public class CarSearchResult extends BaseFunction {


    @And("I select car")
    public void iSelectCar() {
        objCar.selectCar.click();
        objCar.bookingNow.click();
        implicitWait(2);
    }
}
