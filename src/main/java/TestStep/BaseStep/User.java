package TestStep.BaseStep;

import cucumber.api.java.en.Given;

import org.openqa.selenium.NoSuchElementException;


public class User extends BaseFunction {


    @Given("I login to application using email {string} and password {string}")
    public void loginUser(String email, String password) {
        bannerCheck();
        try {

            if (objHomepage.logIn.isDisplayed()){
                objHomepage.logIn.click();
                objHomepage.email.sendKeys(email);
                objHomepage.password.click();
                objHomepage.password.sendKeys(password);
                objHomepage.logIn.click();

            }
        } catch (NoSuchElementException e) {

        }
    }

@Given("I guest user")
    public void guestUser(){
try {
    try {
        //if (driver.findElements(By.id("adfa")).size()==0){
        if (objHomepage.logIn.isDisplayed()) {
            System.out.println("Login display");
            implicitWait(3);
        }
    } catch (Exception e) {
        System.out.println("Login not display");
        objHomepage.account.click();
        objHomepage.logOut.click();
        objHomepage.confirmLogOut.click();
            }
        }
        catch (NoSuchElementException e){

        }
    }
}



