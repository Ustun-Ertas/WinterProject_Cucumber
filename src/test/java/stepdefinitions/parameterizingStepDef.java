package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.parameterizingPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class parameterizingStepDef {
    parameterizingPage page= new parameterizingPage();
    Faker faker = new Faker();

    @Given("madame coco sitesine gidilir")
    public void madame_coco_sitesine_gidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("madame"));


    }
    @Given("arama kutusuna vazo yazilir")
    public void arama_kutusuna_vazo_yazilir() {
       try {
        page.searcbox.sendKeys("Vazo",Keys.ENTER);
       } catch (Exception e) {}

    }
    @Then("sonuclardan vazo oldugu dogrulanir")
    public void sonuclardan_vazo_oldugu_dogrulanir() {
        for (int i = 0; i <page.loging.size() ; i++) {
          try {
            System.out.println(page.loging.get(i).getText());
            assertTrue(page.loging.get(i).getText().contains("Vazo"));
          }catch (Exception e) {}
            Driver.closeDriver();

        }
    }
    @Given("ingilizce menu secilir")
    public void ingilizce_menu_secilir() {
        page.english.click();
        //page.r

    }
    @Given("Arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        String product =faker.commerce().productName();
        if (string.contains("<urun>"))

            try{
            page.searcbox.sendKeys(product);
            } catch (Exception e){}

    }
    @Then("sonuclardan {string} oldugu dogrulanir")
    public void sonuclardan_oldugu_dogrulanir(String string) {
        page.reklam.click();


    }

}
