package validarusuario;

import java.util.Scanner;

public class NovoUsuario {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// ValidarUsuario usuario = new ValidarUsuario();

		boolean validarCpf = false;
		String cpf = "";

		System.out.println("Digite seu cpf: ");
		cpf = input.nextLine();

		validarCpf = ValidarUsuario.cpfValido(cpf);
		ValidarUsuario.menssageCpf(validarCpf);

		boolean validarNome = true;
		String nome = "";

		System.out.println("Digite seu nome: ");
		nome = input.nextLine();

		validarNome = ValidarUsuario.nomeValido(nome);
		ValidarUsuario.menssageNome(validarNome);

		boolean validarIdade = false;
		int idade = -1;

		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		validarIdade = ValidarUsuario.idadeValida(idade);
		ValidarUsuario.menssageIdade(validarIdade);

		System.out.println("\nCPF informado: " + cpf);
		System.out.println("Nome Informado: " + nome);
		System.out.println("Idade Informada: " + idade);

		input.close();

	}

}
