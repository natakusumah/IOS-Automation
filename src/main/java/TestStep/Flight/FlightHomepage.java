package TestStep.Flight;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;


public class FlightHomepage extends BaseFunction {

    @And("I choose flight round trip")
    public void roundTripFlight() {
        String checkTrip = objFlight.trip.getAttribute("value");
        System.out.println("test" + checkTrip);

        try {
            if (checkTrip.equals("0")) {
                objFlight.trip.click();
            }
        } catch (Exception e) {

        }
    }

    @And("I choose flight single trip")
    public void singleTripFlight() {
        String checkTrip = objFlight.trip.getAttribute("value");
        System.out.println("test" + checkTrip);

        try {
            if (checkTrip.equals("1")) {
                objFlight.trip.click();
            }
        } catch (Exception e) {

        }

    }
    @And("I search flight")
    public void searchFLight() {


//        this.originFlight.click();
//        this.searchOriginAirport.sendKeys(FlightDeparture);
//        this.selectLocation.click();
//        this.destinationFlight.click();
//        this.searchDestinationAirport.sendKeys(FlightReturn);
//        this.selectLocation.click();

        objFlight.searchFlight.click();
        implicitWait(5);


    }

}
