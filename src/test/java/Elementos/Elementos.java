package Elementos;

import org.openqa.selenium.By;

public class Elementos {
//@PESSOA FISICA
	private By btnAbrirConta = By.cssSelector(
			"body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By bttnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
	// PJ
	private By btnAbrirContaPj = By.id("bt2");
	private By btnBotaoAbrirContaPessoaUnica = By.id("bt3");

	public By getBtnAbrirContaPj() {
		return btnAbrirContaPj;
	}

	public By getBtnBotaoAbrirContaPessoaUnica() {
		return btnBotaoAbrirContaPessoaUnica;
	}

	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getBttnQueroSerCliente() {
		return bttnQueroSerCliente;

	}

}
