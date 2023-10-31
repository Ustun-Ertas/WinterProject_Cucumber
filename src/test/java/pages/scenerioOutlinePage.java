package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class scenerioOutlinePage {

    public scenerioOutlinePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//span[@class='sc-fqkvVR byzlMQ icon-account']")
    public WebElement login;

}
