package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @BeforeMethod
    public void preConditions(){
        if(isLogged()){
            logOut();
        }
    }

    public void logOut() {
        click(By.cssSelector("[data-test-id = 'header-member-menu-button']"));
        click(By.cssSelector("data-test-id = 'header-member-menu-logout'"));
        click(By.cssSelector("[data-testid='logout-button]"));
    }

    public boolean isLogged() {
        return  wd.findElements(By.cssSelector("[data-test-id = 'header-member-menu-button']")).size()>0;
    }


    @Test
    public void login1() throws InterruptedException {
        inItLogin();
        fillInLoginForm();
        submitLogin();
    }
}
