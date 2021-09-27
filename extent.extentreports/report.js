$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("caneta.feature");
formatter.feature({
  "line": 1,
  "name": "consultar caneta",
  "description": "",
  "id": "consultar-caneta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1967573800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "consulta caneta azul",
  "description": "",
  "id": "consultar-caneta;consulta-caneta-azul",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso o mercado livre",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clico no campo de pesquisa e escrevo \"caneta azul\" e pressiono enter",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "retorna lista de \"caneta azul\"",
  "keyword": "Then "
});
formatter.match({
  "location": "webSteps.queAcessoOMercadoLivre()"
});
formatter.result({
  "duration": 1464184700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "caneta azul",
      "offset": 38
    }
  ],
  "location": "webSteps.clicoNoCampoDePesquisaEEscrevoEPressionoEnter(String)"
});
formatter.result({
  "duration": 2527116100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "caneta azul",
      "offset": 18
    }
  ],
  "location": "webSteps.retornaListaDe(String)"
});
formatter.result({
  "duration": 645746700,
  "status": "passed"
});
formatter.after({
  "duration": 597321500,
  "status": "passed"
});
});