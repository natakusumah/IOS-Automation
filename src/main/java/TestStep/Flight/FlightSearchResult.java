package TestStep.Flight;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class FlightSearchResult extends BaseFunction {

    @And("I {string} change date my flight")
    public void changeDateFlight(String use) {
        if (use.equals("use")) {
            objFlight.date.click();
            objFlight.nextMonthButton.click();
            randomDate();
            implicitWait(4);
        }

    }

    @And ("I {string} worry free fare")
    public void worryFreeFare(String use) {
        if (use.equals("use")) {
            useWorryFreeFare();
        } else if (use.equals("don't")) {
            noUseWorryFreeFare();
        }

    }

    @And ("I use worry free fare")
    public void useWorryFreeFare() {
        String checkWorryFreeFare = objFlight.worryFreeFee.getAttribute("value");
        System.out.println("test" + checkWorryFreeFare);

        try {
            if (checkWorryFreeFare.equals("0")) {
                objFlight.worryFreeFee.click();
            }
        } catch (Exception e) {

        }
    }

    public void noUseWorryFreeFare() {
        String checkWorryFreeFare = objFlight.worryFreeFee.getAttribute("value");
        System.out.println("test" + checkWorryFreeFare);

        try {
            if (checkWorryFreeFare.equals("1")) {
                objFlight.worryFreeFee.click();
            }
        } catch (Exception e) {

        }

    }

    public void filterAirline(String choose) {

        objFlight.filter.click();
        if (choose == "Citilink") {
            scrollable(objFlight.filterCitilink);
            objFlight.apply.click();
            objFlight.selectCitilink.click();
        }
        //objFlight.detailFlight.click();
        //objFlight.chooseFlight.click();
    }


    @And ("I choose airline for single trip")
    public void chooseFlightSingleTrip(){
        objFlight.detailFlight.click();
        objFlight.chooseFlight.click();
        implicitWait(1);

    }

    @And ("I choose airline for round trip")
    public void chooseFlightRoundfTrip(){
        objFlight.detailFlight.click();
        objFlight.chooseFlight.click();
        implicitWait(5);
        objFlight.detailFlight.click();
        objFlight.chooseFlight.click();
        implicitWait(1);
    }
}
