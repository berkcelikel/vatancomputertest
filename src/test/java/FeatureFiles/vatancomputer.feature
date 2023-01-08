Feature: Vatan Test project

  @Regression @Smoke
  Scenario:
    Given Navigate to vatanbilgisayar.com
    And Search to Product
      | search | samsung |
    And Click
      | searchclick |
      | iphone      |
      | addtocard   |
      | close       |
    And Search to Product
      | search | anakart |
    And Click
      | motherboard       |
      | motherboardcard   |
      | gotocard          |
      | extension         |
      | confirm           |
      | withoutmembership |

    And Type info
      | name | Example Name          |
      | mail | examplename@gmail.com |

    And SelectValue
      | city   | ANKARA   |
      | region | AKYURT |

    And Click
      | postcode      |
      | postcodeclick |

    And Type info
      | adress | Deneme adresi |
      | mobile | 5324532151    |

    And Click
      | tc         |
      | beforecard |
      | silmevatan |
      | removecard |

    And Check
      | check |










