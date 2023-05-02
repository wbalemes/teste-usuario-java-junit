package validarusuarioteste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import validarusuario.ValidarUsuario;

class ValidarUsuarioTeste {

	@Test
	void validarCpf () {
String cpf = "12345678901";

ValidarUsuario usuario = new ValidarUsuario();
boolean validarCpf = ValidarUsuario.cpfValido(cpf);

assertTrue(validarCpf);

	}		
	@Test
	void validarNome () {
String nome = "";

ValidarUsuario usuario = new ValidarUsuario();
boolean validarNome = ValidarUsuario.nomeValido(nome);

assertTrue(validarNome);
	}
	@Test
	void validarIdade () {
int idade = 121;

ValidarUsuario usuario = new ValidarUsuario();
boolean validarIdade = ValidarUsuario.idadeValida(idade);

assertTrue(validarIdade);
	}
}
