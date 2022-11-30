package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos m = new Metodos();
	Elementos e = new Elementos();

	public Metodos getM() {
		return m;
	}

	public Elementos getE() {
		return e;
	}

	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		m.abrirNavegador(url);
	}

	@Given("selecionar o botao abrir nova conta")
	public void selecionar_o_botao_abrir_nova_conta() {
		m.clicar(e.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() throws InterruptedException {
		m.pausa(5000);
		m.clicar(e.getBtnAbrirContaParaVoce());
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNome(), "Rian");
		m.preencher(e.getCampoTelefone(), "75982037340");
		m.preencher(e.getCampoEmail(), "riancarlosjesus@gmail.com");
		m.preencher(e.getCampoCpf(), "07554867571");
	}

	@When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
		m.clicar(e.getBttnQueroSerCliente());
	}

	@Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(5000);
		m.validarTexto(e.getTextoFaltaPouco(), "Falta pouco!");
		m.fecharNavegador();
	}
	@When("e preencher o campo com o nome {string}")
	public void e_preencher_o_campo_com_o_nome(String string) {
	  m.preencher(e.getCampoNome(), string);
	}

	@When("e preencher o campo com o email {string}")
	public void e_preencher_o_campo_com_o_email(String string) {
	    m.preencher(e.getCampoEmail(), string);
	}

	@When("e preencher o campo com cpf {string}")
	public void e_preencher_o_campo_com_cpf(String string) {
	    m.preencher(e.getCampoCpf(), string);
	}

	@When("e preencher o campo com telefone {string}")
	public void e_preencher_o_campo_com_telefone(String string) {
	    m.preencher(e.getCampoTelefone(), string);
	}
}