package TestStep.BaseStep;

import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InstructionPayment extends BaseFunction {

    @Then("I check instruction payment virtual account and direct to my order page")
    public void InstructionPaymentVirtualAccount() {
        implicitWait(2);
        wt.until(ExpectedConditions.visibilityOf(objInstructionPayment.AlreadyPayment));
        scrollable(objInstructionPayment.AlreadyPayment);
        objInstructionPayment.GoToMyOrder.click();
        objHomepage.home.click();
    }

    @Then("I check instruction payment transfer bank and direct to my order page")
    public void InstructionPaymentTransferBank() {
        implicitWait(2);
        wt.until(ExpectedConditions.visibilityOf(objInstructionPayment.totalPayment));
        try {
            if(objInstructionPayment.ok.isDisplayed()){
                objInstructionPayment.ok.click();
            }
        }catch (Exception e){

        }
        scrollable(objInstructionPayment.AlreadyPayment);
        objInstructionPayment.GoToMyOrder.click();
        objHomepage.home.click();
    }

    @Then("I check instruction payment minimarket and direct to my order page")
    public void InstructionPaymentMinimarket() {
        implicitWait(2);
        wt.until(ExpectedConditions.visibilityOf(objInstructionPayment.totalPayment));
        scrollTouch(1);
        scrollable(objInstructionPayment.AlreadyPayment);
        objInstructionPayment.GoToMyOrder.click();
        objHomepage.home.click();
    }

    @Then("I check instruction payment atm and direct to my order page")
    public void InstructionPaymentATM() {
        implicitWait(2);
        wt.until(ExpectedConditions.visibilityOf(objInstructionPayment.totalPayment));
        scrollable(objInstructionPayment.AlreadyPayment);
        objInstructionPayment.GoToMyOrder.click();
        objHomepage.home.click();
    }







}
