package TestStep.Train;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class TrainHomepage extends BaseFunction {

    @And("I choose train round trip")
    public void roundTripTrain() {
        String checkTrip = objTrain.trip.getAttribute("value");
        System.out.println("test" + checkTrip);

        try {
            if (checkTrip.equals("0")) {
                objTrain.trip.click();
            }
        } catch (Exception e) {

        }
    }

    @And("I choose train single trip")
    public void singleTripTrain() {
        String checkTrip = objTrain.trip.getAttribute("value");
        System.out.println("test" + checkTrip);

        try {
            if (checkTrip.equals("1")) {
                objTrain.trip.click();
            }
        } catch (Exception e) {

        }

    }
    @And("I search train")
    public void searchTrain() {
        objTrain.searchTrain.click();
        implicitWait(5);


    }

    @And("I want to go from {string} to {string}")
    public void iWantToGoFromTo(String from, String to) {
        objTrain.from.click();
        objTrain.searchCity.click();
        objTrain.searchCity.sendKeys(from);
        objTrain.selectDepart.click();
        objTrain.to.click();
        objTrain.searchCity.click();
        objTrain.searchCity.sendKeys(to);
        objTrain.selectDestination.click();

    }
}