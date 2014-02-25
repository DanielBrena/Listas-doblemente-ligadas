package lista;

import nodo.Nodo;

public class ListaDoble <T>{
	private Nodo<T> p = null;
	
	/**
	 * Metodo que inserta un nodo al inicio de la lista doblemente ligada.
	 * @param dato Dato a insertar en la lista
	 */
	public void insertaAlPrincipio(T dato){
		Nodo<T> q = new Nodo();
		if(p != null){
			q.setValor(dato);
			q.setLigaDerecha(this.p);
			p.setLigaIzquierda(q);
			q.setLigaIzquierda(null);
			p = q;
			
		}else{
			q.setValor(dato);
			p = q;
		}
		
		
		
		
	}
	
	public void mostrar(){
		Nodo<T> q = this.p;
		while(q != null){
			System.out.println(q.getValor());
			q = q.getLigaDerecha();
		}
	}
	public Nodo<T> getP() {
		return p;
	}

	public void setP(Nodo<T> p) {
		this.p = p;
	}
	
	
	
}
