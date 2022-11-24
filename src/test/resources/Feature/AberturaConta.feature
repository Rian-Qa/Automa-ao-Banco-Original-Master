
@aberturaConta
Feature: Abertura de conta

  @pf
  Scenario Outline: Abertura de conta pessoa Fisica
  Given que o usuario acesse a url "https://www.original.com.br/"
  And selecionar o botao abrir nova conta
 And selecionar o botao abrir conta para voce
When preencher o formulario de abertura de conta
And e preencher o campo com o nome "<nome>"
And e preencher o campo com o email "<email>"
And e preencher o campo com cpf "<cpf>"
And e preencher o campo com telefone "<telefone>"
And selecionar o botao quero ser cliente
  Then sera exibido o texto falta pouco
  
  Examples:
            |nome   |email            |cpf        |telefone    |
            |rian   |teste@test.com.br|07554867571|75982037340 |
            |pedro  |teste@test.com.br|03912991588|75982037345 |
            
  
  @pj
  Scenario: Abertura de conta pessoa juridica
  Given que o usuario acesse a url "https://www.original.com.br/"
  And selecionar o botao abrir nova conta
  And selecionar o botao abrir conta para sua empresa
  And selecionar o botao abrir conta pessoa unica 
  
  
  
  
  
  
  

