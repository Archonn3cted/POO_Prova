package prova04;

public class CreditCard extends FormasDePagamento {
	@Override
	protected void Pagar(Conta conta) {
		if(conta.status == false) {
		System.out.println("Sua conta no valor de " + conta.price + " foi paga via Cartão de crédito.");
		conta.status = true;
		} else {
			System.out.println("Essa conta já foi paga.");
		}
	}
}
