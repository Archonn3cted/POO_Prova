package prova01;

import java.util.ArrayList;

public class Carrinho {
	Produto produto;
	ArrayList<Produto> shoppingbag;
	
	Carrinho(Produto produto){
		shoppingbag = new ArrayList<Produto>();
		this.produto = produto;
		shoppingbag.add(this.produto);
	}
	
	void AddTo(Produto produto) {
		shoppingbag.add(produto);
	}
	
	void DysplayProducts(){
		System.out.println("Os itens em seu carrinho são:");
		for(Produto item : shoppingbag) {
			System.out.println(item.name);
	}
	}
}
