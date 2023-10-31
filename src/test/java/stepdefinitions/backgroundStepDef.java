package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BackgoundPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;

public class backgroundStepDef {
    BackgoundPage page =new BackgoundPage();
    String expectedUrl = "";
    @Given("ets tur sitesine gidilir")
    public void etsTurSitesineGidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
        expectedUrl= Driver.getDriver().getCurrentUrl();
       // Driver.getDriver().switchTo().alert().dismiss();

    }

    @And("login butonu ustune gidilir")
    public void loginButonuUstuneGidilir() {
        ReusableMethods.hover(page.login);

    }

    @When("giris butona basilir")
    public void girisButonaBasilir() {
        page.giris.click();
    }

    @And("eposta girilir")
    public void epostaGirilir() {
        page.email.sendKeys("ustun@gmail.com");
    }

    @And("password girilir")
    public void passwordGirilir() {
        page.password.sendKeys("12345");
    }

    @When("giris yap butununa basilir")
    public void girisYapButununaBasilir() {
        page.girisyap.click();
    }

    @Then("sayfaya gidilmedigi dogrulanir")
    public void sayfayaGidilmedigiDogrulanir() {
       String actualUrl = Driver.getDriver().getCurrentUrl();
       assertEquals(expectedUrl,actualUrl);
       Driver.closeDriver();
    }

    @And("uye ol butununa basilir")
    public void uyeOlButununaBasilir() {
        page.uyeOl.click();

    }

    @And("ad girlir")
    public void adGirlir() {
        page.ad.sendKeys("abcd");
    }

    @And("soyad girilir")
    public void soyadGirilir() {
        page.soyad.sendKeys("adfgf");
    }

    @And("uyelik icin eposta girilir")
    public void uyelikIcinEpostaGirilir() {
        page.eposta.sendKeys("ustun@gmail.com");
    }

    @And("ceptelofunu girilir")
    public void ceptelofunuGirilir() {
        page.ceptelefon.sendKeys("345678");
    }

    @And("uyelik icin password girilir")
    public void uyelikIcinPasswordGirilir() {
        page.sifre1.sendKeys("123453");
    }

    @And("password yeniden girilir")
    public void passwordYenidenGirilir() {
        page.sifre2.sendKeys("123453");

    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        page.kullanim.click();
    }

    @And("kampanyalar checkbox secilir")
    public void kampanyalarCheckboxSecilir() {
        page.firsat.click();
    }

    @When("uyelik  butununa basilir")
    public void uyelikButununaBasilir() {
        page.uyelik.click();

    }

    @Then("sayfaya gidilemedigi dogrulanir")
    public void sayfayaGidilemedigiDogrulanir() {
    }

}
