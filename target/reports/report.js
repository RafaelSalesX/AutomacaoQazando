$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 5,
  "name": "Cadastro de usuário",
  "description": "",
  "id": "cadastro-de-usuário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuário;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 7,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "eu preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "vejo a mensagem de cadastro realizado com sucesso",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});