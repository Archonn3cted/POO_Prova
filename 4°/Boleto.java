package prova04;

public class Boleto extends FormasDePagamento {
	@Override
	protected void Pagar(Conta conta) {
		if(conta.status == false) {
		System.out.println("Sua conta no valor de " + conta.price + " foi paga via boleto.");
		conta.status = true;
		} else {
			System.out.println("Essa conta já foi paga.");
		}
	}
}
