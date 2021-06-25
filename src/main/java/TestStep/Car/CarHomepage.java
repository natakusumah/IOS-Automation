package TestStep.Car;


import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;



public class CarHomepage extends BaseFunction {


    @And("I choose Location {string}")
    public void iChooseLocation(String location) {

        objCar.pickUp.click();
        objCar.location.sendKeys(location);
        objCar.selectLocation.click();
    }

    @And("I search car")
    public void iSearchCar() {
        objCar.searchCar.click();
        implicitWait(3);
    }
}