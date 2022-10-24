package prova06;

import java.util.ArrayList;

public class Cliente {
	String name;
	ContaCorrente contacorrente;
	ArrayList<ContaCorrente> contas = new ArrayList<>(); // relação 1 p/ n.
	
	Cliente(){
		
	}
	
	Cliente(String name, ContaCorrente contacorrente){
		this.name = name;
		this.contacorrente = contacorrente;
		contas.add(this.contacorrente);
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + ", contacorrente=" + contacorrente + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ContaCorrente getContacorrente() {
		return contacorrente;
	}

	public void setContacorrente(ContaCorrente contacorrente) {
		this.contacorrente = contacorrente;
	}

	public ArrayList<ContaCorrente> getContas() {
		return contas;
	}

	public void setContas(ArrayList<ContaCorrente> contas) {
		this.contas = contas;
	}
}
