package TestStep.Train;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class TrainBookingForm extends BaseFunction {

    @And("I fill my passenger data for train")
    public void fillPassengerTrain() {
        scrollTouch(1);
        scrollable(objTrain.sameAsContact);
        objTrain.ktp.click();
        objTrain.ktp.sendKeys(randIdentityNumber());
        hideKeyboard();
        hideKeyboard();
        objTrain.savePassanger.click();

    }

    @And("I {string} using insurance for my train")
    public void useInsuranceTrain(String use) {
        if (use == "use") {
            scrollable(objTrain.insurance);
        }

    }

    @And("I confirm my data train")
    public void confirmDataTrain() {
        scrollable(objTrain.continueTrain);
        objTrain.confirmData.click();
        implicitWait(10);
    }

    @And("I fill guest data train with email {string}")
    public void fillGuestData(String email) {
        String checkEmail = "Email";

        try {
            if (objTrain.email.getText().equals(checkEmail)) {
                objTrain.fullName.sendKeys(randName());
                hideKeyboard();
                objTrain.title.click();
                objTrain.chooseTitle.click();
                objTrain.email.sendKeys(email);
                hideKeyboard();
                objTrain.phoneNumber.click();
                objTrain.phoneNumber.sendKeys(randomPhoneNumber());
                hideKeyboard();
            }
        } catch (Exception e) {

        }
    }

}
