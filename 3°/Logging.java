package prova03;

public class Logging extends Login {
	private boolean Logged = false;
	@Override
	protected void SigninWith(TypesOfSignIns type) {
		if(Logged == false){
			
		if(type.equals(TypesOfSignIns.Google)) {
			Logged = true;
			Google();
		} else if (type.equals(TypesOfSignIns.Facebook)) {
			Logged = true;
			Facebook();
		} else if (type.equals(TypesOfSignIns.Icloud)) {
			Logged = true;
			Icloud();}
		} else {
			System.out.println("You're already logged in, if you wanna log in with "
					+ "a different account, you nedda log out first.");
		}
		
	}
	private void Icloud() {
		System.out.println("You're now logged in with your Icloud account");
	}
	private void Facebook() {
		System.out.println("You're now logged in with your Facebook account");
	}
	private void Google() {
		System.out.println("You're now logged in with your Google account");
		
	}
	@Override
	protected void Login(String user, String password) {
		if(Logged == false){
			Logged = true;
		System.out.println("You're now logged in.");
		} else {System.out.println("You're already logged in, if you wanna log in with "
				+ "a differnt account, you nedda log out first.");
			
		}
	}


	

}
