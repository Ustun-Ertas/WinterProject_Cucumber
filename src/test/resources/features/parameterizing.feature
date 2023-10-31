
Feature: Searcparameterizing

  Scenario: TC-01
    Given madame coco sitesine gidilir
    And arama kutusuna vazo yazilir
    Then sonuclardan vazo oldugu dogrulanir

  @madame
    Scenario: Parametreli Arama Kutusu Testi
      Given madame coco sitesine gidilir
      And ingilizce menu secilir
      And Arama kutusuna "<urun>" yazilir
      Then sonuclardan "<urun>" oldugu dogrulanir