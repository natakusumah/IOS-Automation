package TestStep.BaseStep;

import BaseClass.BaseSetUp;
import PageObject.*;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class BaseFunction {


    public static MainHomepage objHomepage = new MainHomepage(BaseSetUp.driver);
    public static Flight objFlight = new Flight(BaseSetUp.driver);
    public static Hotel objHotel = new Hotel(BaseSetUp.driver);
    public static Car objCar = new Car(BaseSetUp.driver);
    public static Train objTrain = new Train(BaseSetUp.driver);
    public static ListPayment objChoosePayment = new ListPayment(BaseSetUp.driver);
    public static InstructionPay objInstructionPayment = new InstructionPay(BaseSetUp.driver);
    public WebDriverWait wt = new WebDriverWait(BaseSetUp.driver,45);
    public WebDriverWait wtShort = new WebDriverWait(BaseSetUp.driver,8);



    public void hideKeyboard(){
        BaseSetUp.driver.getKeyboard().pressKey("\n");
    }

    public void bannerCheck() {

        try {
            if (wtShort.until(ExpectedConditions.visibilityOf(objHomepage.closeBanner))!= null){

                System.out.println("Banner not show");
                wtShort.until(ExpectedConditions.visibilityOf(objHomepage.closeBanner)).click();
            }
        } catch (Exception e) {
            System.out.println("Banner show");
        }
    }

    public void implicitWait(Integer time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
        }
    }

    public void randomDate() {

        Random rand = new Random();
        int min = 1;
        int max = 28;
        int value = rand.nextInt((max - min) + 1) + min;

        String number = Integer.toString(value);
        String calendar = "calendarFlightCell" + number;

        BaseSetUp.driver.findElementById(calendar).click();
    }


    public void scrollTouch(Integer times) {

        org.openqa.selenium.Dimension size = BaseSetUp.driver.manage().window().getSize();
        System.out.println(size);
        int width = size.width/2;
        int startPoint =(int) (size.getHeight()*0.7);
        System.out.println(startPoint);
        int endPoint =(int) (size.getHeight()*0.3);
        System.out.println(endPoint);
        TouchAction touchAction = new TouchAction(BaseSetUp.driver);


        for(int i=0;i<times;i++) {
            touchAction.press(width,startPoint).waitAction(Duration.ofSeconds(2)).moveTo(width,endPoint).release().perform();
        }

    }

    public void scrollable(IOSElement driver) {

        boolean elementLoaded = false;
        int swipeCount = 0;
        while (!elementLoaded && swipeCount < 5) {
            if (!driver.isDisplayed()) {
                scrollTouch(1);
                swipeCount++;
            } else {
                elementLoaded = true;
                implicitWait(1);
                driver.click();
            }
        }
    }

    public String randName() {

        String[] firstName ={"Karin", "Louis", "Chris", "Nas", "Anton", "Kylian"};
        String[] lastName = {"Jahyadi", "Vera", "Nugraha", "Xander", "Yordan", "Jordan"};
        Random rand = new Random();
        return firstName[rand.nextInt(firstName.length)]+" "+lastName[rand.nextInt(lastName.length)];
    }

    public String randomPhoneNumber() {
        String num ="8";
        String genId = "0123456789";
        StringBuilder phoneNumber = new StringBuilder();
        Random rnd = new Random();
        while (phoneNumber.length() < 12) {
            int index = (int) (rnd.nextFloat() * genId.length());
            phoneNumber.append(num+genId.charAt(index));
        }
        String idString = phoneNumber.toString();
        return idString;

    }

    public String randIdentityNumber() {
        String genId = "0123456789";
        StringBuilder identityNumber = new StringBuilder();
        Random rnd = new Random();
        while (identityNumber.length() < 12) {
            int index = (int) (rnd.nextFloat() * genId.length());
            identityNumber.append(genId.charAt(index));
        }
        String idString = identityNumber.toString();
        return idString;

    }

//    public void waitLoading(IOSElement driver) {
//        WebElement waitElement = null;
//
//        //Sets FluentWait Setup
//        FluentWait<RemoteWebDriver> fwait = new FluentWait<RemoteWebDriver>(BaseSetUp.driver)
//                .withTimeout(15, TimeUnit.SECONDS)
//                .pollingEvery(500, TimeUnit.MILLISECONDS)
//                .ignoring(NoSuchElementException.class)
//                .ignoring(TimeoutException.class);
//
//        //First checking to see if the loading indicator is found
//        // we catch and throw no exception here in case they aren't ignored
//        try {
//            waitElement = fwait.until(new Function<RemoteWebDriver, WebElement>() {
//                public WebElement apply(RemoteWebDriver driver) {
//                    return driver.findElement(By.id(String.valueOf(driver)));
//                }
//            });
//        } catch (Exception e) {
//        }
//
//        //checking if loading indicator was found and if so we wait for it to
//        //disappear
//        if (waitElement != null) {
//            WebDriverWait wait = new WebDriverWait(driver, 120);
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(
//                    By.id(String.valueOf(driver)))
//            );
//        }
//    }

//    protected void getScreenshot(){
//        scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
//    }

}
