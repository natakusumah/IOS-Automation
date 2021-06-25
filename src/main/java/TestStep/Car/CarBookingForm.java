package TestStep.Car;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;



public class CarBookingForm extends BaseFunction {


    @And("I fill pick up detail location {string}")
    public void iFillPickUpDetailLocation(String detailLocation) {
        scrollable(objCar.pickUpDetailLocations);
        objCar.pickUpDetailLocations.sendKeys(detailLocation);
        hideKeyboard();
    }

    @And("I confirm my data car")
    public void iConfirmMyDataCar() {
        scrollable(objCar.continueCar);
        objCar.confirmCar.click();
        implicitWait(7);
    }

    @And("I fill guest data car with email {string}")
    public void fillGuestData(String email) {
        String checkEmail = "Email";

        try {
            if (objCar.email.getText().equals(checkEmail)) {
                objCar.fullName.sendKeys(randName());
                hideKeyboard();
                objCar.title.click();
                objCar.chooseTitle.click();
                objCar.email.sendKeys(email);
                hideKeyboard();
                objCar.phoneNumber.click();
                objCar.phoneNumber.sendKeys(randomPhoneNumber());
                hideKeyboard();
            }
        } catch (Exception e) {

        }
    }
}
