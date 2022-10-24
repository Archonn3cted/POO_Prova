package prova06;

public class ContaEspecial extends ContaCorrente {
	private float limite;
	
	ContaEspecial(ContaCorrente contacorrente, float limite) {
		super();
		this.limite = limite;
		}	

	boolean Sacar(float valor) {
		if(this.saldo > valor){
			this.saldo -= valor;
			return true;
			} else if(this.saldo + this.limite > valor) {
				this.saldo -= valor;
				return true;
			} else { 
				return false;
		}
	}
	@Override
	public String toString() {
		return "ContaEspecial [saldo=" + saldo + ", limite=" + limite + "]";
}
}
	