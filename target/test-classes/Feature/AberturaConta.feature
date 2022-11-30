
@aberturaConta
Feature: Abertura de conta

  @pf
  Scenario Outline: Abertura de Conta pessoa Fisica
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
           
            
  
 
  
  
  
  
  
  
  

