package TestStep.Flight;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightBookingForm extends BaseFunction {


    @And("I fill my contact details using email {string}")
    public void fillGuestUser(String email){
        implicitWait(5);
        try {
        if (objFlight.enterContact.isDisplayed()) {
            objFlight.enterContact.click();
            //objFlight.fullName.click();
            objFlight.fullName.sendKeys(randName());
            hideKeyboard();
            objFlight.titleGuest.click();
            objFlight.chooseTitle.click();
          //  objFlight.phoneNumber.click();
            objFlight.phoneNumber.sendKeys(randomPhoneNumber());
            hideKeyboard();
          //  objFlight.guestEmail.click();
            objFlight.guestEmail.sendKeys(email);
            hideKeyboard();
            objFlight.saveGuest.click();
        }

        }catch (Exception e){

        }
    }


    @And("I fill my passenger data for flight")
    public void fillPassengerFlight(){
        String nationality ="Indonesia";
        implicitWait(2);
        wt.until(ExpectedConditions.elementToBeClickable(objFlight.sameAsContact)).click();
        objFlight.fullName.clear();
        objFlight.fullName.setValue(randName());
        hideKeyboard();
        try {
            if (objFlight.indonesia.isDisplayed()){
        }
        } catch (Exception e){
            objFlight.nationality.click();
            objFlight.chooseNationality.click();
        }
        objFlight.savePassenger.click();
        scrollTouch(1);

    }

    @And ("I {string} using insurance for my flight")
    public void useInsuranceFlight(String use){
        if (use == "use"){
            scrollable(objFlight.insurance);
            //objFlight.insurance.click();
        }

    }

    @And ("I {string} additional baggage")
    public void useBaggage(String use){
        if (use == "use") {
            objFlight.buyBaggage.click();
            objFlight.additionalBaggage.click();
            objFlight.chooseBaggage.click();
            objFlight.saveBaggage.click();

        }
    }

    public void reload(){
        try {
            if(objFlight.reload.isDisplayed()){
                objFlight.reload.click();
            }
        }
        catch (Exception e){

        }
    }

    public void checkPriceChange(){
        reload();
        try {
            if (objFlight.changePrice.isDisplayed()){
                objFlight.confirmChangePrice.click();
            }
        }
        catch (Exception e){

        }
    }

    @And ("I confirm my data flight")
    public void confirmDataFlight() {
        scrollable(objFlight.continuePayment);
        objFlight.confirmPayment.click();
        implicitWait(17);
        checkPriceChange();
    }



}
