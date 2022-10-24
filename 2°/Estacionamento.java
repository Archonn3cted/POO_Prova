package prova02;
import java.util.ArrayList;

public class Estacionamento {
	ArrayList<Carros> ListaDeCarros = new ArrayList<Carros>();
	
	void AddCars(Carros carro){
		ListaDeCarros.add(carro);
	}
	
	void DysplayCars() {
		if(ListaDeCarros != null) {
		for(Carros carro: ListaDeCarros) {
			System.out.println(carro.placa);
		}
		}
	}
	int Total = 0;
	int TotalOfPeople() {
		if(ListaDeCarros != null) {
			for(Carros carro: ListaDeCarros) {
				Total += carro.pessoa.quantidade;
		}
		}
		return Total;
		
		}
}
