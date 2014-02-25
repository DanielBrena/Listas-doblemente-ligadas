package nodo;

public class Nodo <T>{
	private T valor;
	private Nodo<T> ligaDerecha;
	private Nodo<T> ligaIzquierda;
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public Nodo<T> getLigaDerecha() {
		return ligaDerecha;
	}
	public void setLigaDerecha(Nodo<T> ligaDerecha) {
		this.ligaDerecha = ligaDerecha;
	}
	public Nodo<T> getLigaIzquierda() {
		return ligaIzquierda;
	}
	public void setLigaIzquierda(Nodo<T> ligaIzquierda) {
		this.ligaIzquierda = ligaIzquierda;
	}
	
	
	
	
}
