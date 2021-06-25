package TestStep.Train;

import TestStep.BaseStep.BaseFunction;
import cucumber.api.java.en.And;

public class TrainSearchResult extends BaseFunction {


    @And("I choose train for single trip")
    public void chooseFlightSingleTrip(){
        objTrain.selectTrain.click();
        implicitWait(2);
    }

    @And ("I choose train for round trip")
    public void chooseFlightRoundfTrip(){
        objTrain.selectTrain.click();
        implicitWait(4);
        objTrain.selectTrain.click();
        implicitWait(2);
    }


}
