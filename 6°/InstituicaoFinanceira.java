package prova06;

import java.util.ArrayList;

public class InstituicaoFinanceira {
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente(70000);
		ContaCorrente c2 = new ContaCorrente(95000);
		
		Cliente cl1 = new Cliente("Maria", c1);
		Cliente cl2 = new Cliente("João", c2);
		
		System.out.println(c1.Sacar(68000));
		System.out.println(c1.Transferir(c2, 2000));
		
		System.out.println(cl1.contacorrente.saldo);
		System.out.println(cl2.contacorrente.saldo);
		
		ContaCorrente ccl1 = new ContaEspecial(c1, 100000);
		ContaCorrente ccl2 = new ContaEspecial(c2, 2);
		
		System.out.println(ccl1.Sacar(60000));
		System.out.println(ccl1.saldo);
		
		
		
	}

}
