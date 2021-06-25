package TestStep.BaseStep;

import cucumber.api.java.en.And;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChoosePayment extends BaseFunction {

    public void otherPaymentMethod(){
        try {
            if(objChoosePayment.otherPaymentMethod.isDisplayed()){
                objChoosePayment.otherPaymentMethod.click();
                implicitWait(1);
                scrollTouch(1);
            }

        }catch (Exception e){

        }
    }

    @And("I choose payment virtual account mandiri")
    public void virtualAccountMandiri() {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.mandiriVirtualAccount);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.continuePay.click();

    }

    @And("I choose payment virtual account BCA")
    public void virtualAccountBCA()  {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.bcaVirtualAccount);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.continuePay.click();
    }

    @And("I choose payment virtual account BNI")
    public void virtualAccountBNI() {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.bniVirtualAccount);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.continuePay.click();
    }

    @And("I choose payment virtual account BRIVA")
    public void virtualAccountBRIVA()  {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.BRIVA);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.continuePay.click();
    }

    //ATM
    @And("I choose payment ATM")
    public void ATM()  {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.ATM);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.pay.click();
    }

    //Transfer
    @And("I choose payment transfer bank BCA")
    public void transferBankBCA() {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.transferBCA);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.pay.click();
    }

    @And("I choose payment transfer bank Mandiri")
    public void transferBankMandiri()  {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.transferMandiri);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.importantInfo));
        objChoosePayment.pay.click();
    }

    // minimarket
    @And("I choose payment Alfamart")
    public void alfamart() {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.alfamart);
        implicitWait(1);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.price));
        objChoosePayment.continuePay.click();
    }

    @And("I choose payment Indomaret")
    public void indomaret() {
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        scrollable(objChoosePayment.indomaret);
        objChoosePayment.indomaret.click();
        implicitWait(1);
        wt.until(ExpectedConditions.elementToBeClickable(objChoosePayment.price));
        objChoosePayment.continuePay.click();
    }

    @And("I choose payment TIXPoint")
    public void TIXPoint(){
        wt.until(ExpectedConditions.visibilityOf(objChoosePayment.totalPayment));
        otherPaymentMethod();
        objChoosePayment.TIX.click();
        objChoosePayment.confirmTIX.click();
        objChoosePayment.payTIX.click();
        implicitWait(10);
        objChoosePayment.payNow.click();
        implicitWait(2);
        objChoosePayment.goToMyOrder.click();

    }
}
