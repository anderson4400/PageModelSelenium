package BrowserStarckHomePages;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSignUpPage {
    WebDriver driver;


    //Se cambiaron los FindElements por @FindBy para utilizar el PageFactory y inicializar los elementos web
    //De esta maneta optimizamos mas el codigo y utilizamos buenas practicas a la hora de automatizar
    @FindBy (xpath = "//h1") WebElement Header;
    @FindBy (xpath = "//*[@id='user_full_name']") WebElement userName;
    @FindBy (xpath = "//*[@id='user_email_login']") WebElement businessEmail;
    @FindBy (xpath = "//*[@id='user_password']") WebElement password;


    public BrowserStackSignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void veryHeader() {
        String getheadertext = Header.getText().trim();
        assertEquals("Create a FREE Account", getheadertext);
    }
    public void enterFullName(String arg1) {
       userName.sendKeys(arg1);
    }
    public void enterBusinessEmail(String arg1) {
        businessEmail.sendKeys(arg1);
    }
    public void enterPasswrod(String arg1) {
        password.sendKeys(arg1);
    }
}