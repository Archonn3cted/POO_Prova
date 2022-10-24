package prova03;

abstract class Login {
	public void FazerLogin() {
		SigninWith(null);
		Login(null, null);
	}

	abstract void SigninWith(TypesOfSignIns type);

	abstract void Login(String user, String password);

	
}
