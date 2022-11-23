package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	Metodos m = new Metodos();
	Elementos e = new Elementos();

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

	// Pessoa Juridica

	@Given("selecionar o botao abrir conta para sua empresa")
	public void selecionar_o_botao_abrir_conta_para_sua_empresa() {
		m.clicar(e.getBtnAbrirContaPj());
	}

	@Given("selecionar o botao abrir conta pessoa unica")
	public void selecionar_o_botao_abrir_conta_pessoa_unica() {
		m.clicar(e.getBtnBotaoAbrirContaPessoaUnica());
	}

	@Given("e preencher o campo com o nome {string}")
	public void e_preencher_o_campo_com_o_nome(String nome) {
		m.preencher(e.getCampoNome(), nome);
	}

	@Given("e preencher o campo com o email {string}")
	public void e_preencher_o_campo_com_o_email(String email) {
		m.preencher(e.getCampoEmail(), email);
	}

	@Given("e preencher o campo com cpf {string}")
	public void e_preencher_o_campo_com_cpf(String cpf) {
		m.preencher(e.getCampoCpf(), cpf);
	}

	@Given("e preencher o campo com telefone {string}")
	public void e_preencher_o_campo_com_telefone(String telefone) {
		m.preencher(e.getCampoTelefone(), telefone);
	}
}
