package prova02;

public class Controle {
	public static void main(String[] args) {
		Estacionamento e1 = new Estacionamento();
		
		Pessoas p1 = new Pessoas(5);
		Pessoas p2 = new Pessoas(3);
		
		Carros c1 = new Carros("PLM-1597", p1);
		Carros c2 = new Carros("SAM-1271", p2);
		
		e1.AddCars(c1);
		e1.AddCars(c2);
		e1.DysplayCars();
		System.out.println(e1.TotalOfPeople());
		
		
	}

}
