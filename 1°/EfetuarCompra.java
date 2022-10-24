package prova01;

import java.util.ArrayList;

public class EfetuarCompra {
	public static void main(String[] args) {
		Itens item1 = new Itens("Portas", 700);
		Itens item2 = new Itens("Banco", 350);
		
		Itens item3 = new Itens("Lanterna", 150);
		Itens item4 = new Itens("Pneu", 230);
		
		ArrayList<Itens> ListaDeItens1;
		ListaDeItens1 = new ArrayList<>();
		ListaDeItens1.add(item1);
		ListaDeItens1.add(item2);
		
		ArrayList<Itens> ListaDeItens2;
		ListaDeItens2 = new ArrayList<>();
		ListaDeItens2.add(item3);
		ListaDeItens2.add(item4);
		
		
		Produto p1 = new Produto("Carro", ListaDeItens1);
		Produto p2 = new Produto("Moto", ListaDeItens2);
				
		Compra c1 = new Compra();		
		c1.Comprar(p1);
		c1.Comprar(p2);
		
		c1.ValorDaCompra();
		
		Carrinho s1 = new Carrinho(p1);
		s1.AddTo(p2);
		s1.DysplayProducts();
	}
}
