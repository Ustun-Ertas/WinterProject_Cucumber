package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class parameterizingPage {

    public parameterizingPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="pz-form-input-AutocompleteInput")
    public WebElement searcbox;

    @FindBy(xpath="//a[@class-'product-item__name']")
    public List<WebElement> loging;

    @FindBy(xpath="//div[@class='band-menu']//button[@type='submit'][normalize-space()='EN']")
    public WebElement english;

    @FindBy(xpath="//img[@class='mfp-close wis-mfp-close-244800']")
    public WebElement reklam;
}
