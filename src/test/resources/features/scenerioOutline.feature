Feature: Negatif uyelik

  Scenario Outline: Negatif uyelik
    Given boyner sitesine gidilir
    When login ikonu ustune gidilir
    And uye ol linki tiklanir
    Then uyelik sayfasinda oldugunu dogrulanir
    And ueylik sayfasinda "<ad>" girilir
    And uyelik sayfasinda "<email>" girilir
    And uyelik sayfasinda "<sifre>" girilir
    And uyelik sayfasinda "<ceptelefon>" girilir
    And uyelik sayfasinda "<uyelik metni>" checkbox secilir
    And uyelik sayfasinda "<riza metni>"  cehckbox secilir
    And uye ol butonu tiklanir
    Then uye olmadigini dogrulanir
    Examples:
      | ad    | email                 | sifre  | ceptelefon | uyelik metni | riza metni |
      | ustun | ustun.er              | 123456 | 555677890  | 1            | 1          |
      | ustun | ustun.ertas           | 123456 | 555677890  | 1            | 1          |
      | ustun | ustun.ertas@          | 123456 | 555677890  | 1            | 1          |
      | ustun | ustun.ertas@gmail     | 123456 | 555677890  | 1            | 1          |
      | ustun | ustun.ertas@gmail.    | 123456 | 555677890  | 1            | 1          |
      | ustun | ustun.ertas@gmail.com | 123456 | 555677890  | 1            | 1          |

