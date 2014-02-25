package main;

import lista.ListaDoble;

public class Main {
	public static void main(String[] args){
		
		ListaDoble<String> lista = new ListaDoble<>();
		lista.insertaAlPrincipio("1");
		lista.insertaAlPrincipio("2");
		lista.insertaAlPrincipio("3");
		lista.insertarAlFinal("0");
		lista.insertaAlPrincipio("4");
		lista.mostrar();
	}
}
