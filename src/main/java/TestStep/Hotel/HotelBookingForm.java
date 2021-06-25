package TestStep.Hotel;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;



public class HotelBookingForm extends BaseFunction {

    @And("I fill my contact details hotel using email {string}")
    public void fillGuestUser(String email){
        implicitWait(5);
        try {
            if (objHotel.enterContact.isDisplayed()) {
                objHotel.enterContact.click();
                objHotel.Name.sendKeys(randName());
                hideKeyboard();
                objHotel.titleGuest.click();
                objHotel.chooseTitle.click();
                objHotel.phoneNumber.sendKeys(randomPhoneNumber());
                hideKeyboard();
                objHotel.guestEmail.sendKeys(email);
                hideKeyboard();
                objHotel.saveGuest.click();
            }

        }catch (Exception e){

        }
    }

    @And("I booking for another person")
    public void iBookingForAnotherPerson() {
        implicitWait(3);
        objHotel.sameAsContact.click();
        objHotel.name.sendKeys(randName());
        hideKeyboard();
        objHotel.title.click();
        objHotel.mrs.click();
    }

    @And("I fill special request {string}")
    public void iFillSpecialRequest(String additional) {
        implicitWait(3);
        scrollable(objHotel.makeSpecialRequest);
        objHotel.specialRequest.sendKeys(additional);
        hideKeyboard();
        objHotel.save.click();
        implicitWait(4);

    }

    @And("I confirm my data hotel")
    public void iConfirmMyDataHotel() {
        scrollable(objHotel.continueToPayment);

    }
}
