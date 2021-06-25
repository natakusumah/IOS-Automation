package TestStep.BaseStep;

import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;


public class MainHomePage extends BaseFunction {




    @When("I want to booking Flight product")
    public void homepageFlight(){
        try {
            objHomepage.flight.click();
        } catch (NoSuchElementException e) {

        }

    }

    @When("I want to booking train product")
    public void homepageTrain() {
        try {
            objHomepage.train.click();
        }
        catch (NoSuchElementException e){

        }
    }

    @When("I want to booking car product")
    public void iWantToBookingCarProduct() {
        objHomepage.car.click();
    }

    @When("I want to booking hotel product")
    public void iWantToBookingHotelProduct() {

        objHomepage.hotel.click();
    }
}
