
Feature: ets tur sitesi login
  Background:  ets sitesi giris
    Given ets tur sitesine gidilir
    And login butonu ustune gidilir
  @ets
  Scenario: TC-01 ets tur login
    When giris butona basilir
    And eposta girilir
    And password girilir
    When giris yap butununa basilir
    Then sayfaya gidilmedigi dogrulanir

    Scenario: TC-02 ets tur uyelik
      And uye ol butununa basilir
      And ad girlir
      And soyad girilir
      And uyelik icin eposta girilir
      And ceptelofunu girilir
      And uyelik icin password girilir
      And password yeniden girilir
      And kullanim sartlari checkbox secilir
      And kampanyalar checkbox secilir
      When uyelik  butununa basilir
      Then sayfaya gidilemedigi dogrulanir


