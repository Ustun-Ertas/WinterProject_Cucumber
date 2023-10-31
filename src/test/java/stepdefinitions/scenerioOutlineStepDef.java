package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.scenerioOutlinePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class scenerioOutlineStepDef {
    scenerioOutlinePage page = new scenerioOutlinePage();

    @Given("boyner sitesine gidilir")
    public void boynerSitesineGidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
    }

    @When("login ikonu ustune gidilir")
    public void loginIkonuUstuneGidilir() {
        ReusableMethods.hover(page.login);
    }

    @And("uye ol linki tiklanir")
    public void uyeOlLinkiTiklanir() {
    }

    @Then("uyelik sayfasinda oldugunu dogrulanir")
    public void uyelikSayfasindaOldugunuDogrulanir() {
    }

    @And("ueylik sayfasinda {string} girilir")
    public void ueylikSayfasindaGirilir(String arg0) {
    }

    @And("uyelik sayfasinda {string} girilir")
    public void uyelikSayfasindaGirilir(String arg0) {
    }

    @And("uyelik sayfasinda {string} checkbox secilir")
    public void uyelikSayfasindaCheckboxSecilir(String arg0) {
    }

    @And("uyelik sayfasinda {string}  cehckbox secilir")
    public void uyelikSayfasindaCehckboxSecilir(String arg0) {
    }

    @And("uye ol butonu tiklanir")
    public void uyeOlButonuTiklanir() {
    }

    @Then("uye olmadigini dogrulanir")
    public void uyeOlmadiginiDogrulanir() {
    }
}
