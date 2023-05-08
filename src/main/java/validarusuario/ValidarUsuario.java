package validarusuario;

public class ValidarUsuario {
	


	public static boolean cpfValido(String validarCpf) {
		if (validarCpf.length() == 11)
			return true;
		else
			return false;

	}

	public static boolean menssageCpf(boolean validarCpf) {
		if (validarCpf == true) {
			System.out.println ("CPF valido.");
			return true;
		} else {
			System.out.println("CPF invalido!");
			return false;
		}
	}

	public static boolean nomeValido(String validarNome) {
		if (validarNome.isBlank())
			return false;
		else
			return true;

	}

	public static boolean menssageNome(boolean validarNome) {
		if (validarNome == false) {
			System.out.println("O nome não pode ser vazio!");
			return false;
		} else {
			return true;

		}
	}

	public static boolean idadeValida(int validarIdade) {
		if (validarIdade >= 0 && validarIdade <= 120)
			return true;
		else
			return false;

	}

	public static boolean menssageIdade(boolean validarIdade) {
		if (validarIdade == true) {
			System.out.println("Idade valida!");
			return true;
		} else {
			System.out.println("Idade invalida, a idade deve ser de 0 a 120 anos.");
			return false;
		}
	}
}
