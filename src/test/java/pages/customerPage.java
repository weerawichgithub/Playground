package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class customerPage {

    public customerPage() {PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")
    public WebElement usernameLoginInput;

    @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")
    public WebElement passwordLoginInput;

    @FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
    public WebElement loginButton;

    public void goLogin(String username,String password) {
        this.usernameLoginInput.sendKeys(username);
        this.passwordLoginInput.sendKeys(password);
        this.loginButton.click();
    }
}
