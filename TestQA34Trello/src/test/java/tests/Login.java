package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }

    @Test
    public void loginPositive() throws InterruptedException {
        app.getUser().inItLogin();
        app.getUser().fillInLoginForm();
        app.getUser().submitLogin();
    }
}
