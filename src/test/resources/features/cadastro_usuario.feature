#language: pt
#enconding : UTF-8

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Então vejo a mensagem de cadastro realizado com sucesso