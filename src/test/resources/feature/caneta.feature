Feature: consultar caneta

  Scenario: consulta caneta azul
    Given   que acesso o mercado livre
    When    clico no campo de pesquisa e escrevo "caneta azul" e pressiono enter
    Then    retorna lista de "caneta azul"