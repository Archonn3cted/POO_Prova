package prova01;

import java.util.ArrayList;

public class Compra {
	Produto produto;
	ArrayList<Double> Valor;
	
	Compra(){
		Valor = new ArrayList<Double>();
	}
	
	void Comprar(Produto produto){
		this.produto = produto;
		
		
		for(Itens item: produto.item) {
			Valor.add(item.price);
			}
	}

	void ValorDaCompra(){
		double ValorTotal = 0;
		for(Double value: Valor) {
			ValorTotal += value;
	}
	System.out.println("O valor total da compra foi de: " + ValorTotal + "\n");
		
			
	}
	}

