package prova04;

public class Pagamento {
	public static void main(String[] args) {
		Conta c1 = new Conta(75.0);
		Conta c2 = new Conta(105.0);
		FormasDePagamento f1 = new PIX();
		FormasDePagamento f2 = new CreditCard();
		
		f1.Pagar(c1);
		f2.Pagar(c1);
		f2.Pagar(c2);
	
	}
}
