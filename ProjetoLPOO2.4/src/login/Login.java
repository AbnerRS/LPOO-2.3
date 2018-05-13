package login;

import usuarios.*;

public class Login {
	
	private String login;
	private String senha;

	public Login(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
	}

	public boolean logar() {
		if (validarLogin() && validarSenha()) 
				return true;
		else
				return false;
	}

	private boolean validarLogin() {
		if (this.login.equals("log")) {
			return true;
		} else {
			return false;
		}
	}

	private boolean validarSenha() {
		if (this.senha.equals("s")) {
			return true;
		} else {
			return false;
		}
	}

}
