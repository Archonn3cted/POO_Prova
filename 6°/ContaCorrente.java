package prova06;

public class ContaCorrente {
	protected float saldo;
	
	ContaCorrente() {
		saldo = 0;
	}	
	
	ContaCorrente(float saldo) {
		this.saldo = saldo;
		
	}

	void Depositar(float valor) {
		this.saldo += valor;
		
	}
	boolean Sacar(float valor) {
		if(this.saldo < valor){
		return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}
	boolean Transferir(ContaCorrente contacorrente, float valor) {
		this.saldo -= valor;
		contacorrente.saldo += valor;
		return true;
		
	}
	@Override
	public String toString() {
		return "ContaCorrente [saldo=" + saldo + "]";
	}

}
