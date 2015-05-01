package listaCircular;

public class nodo {
int dato;
nodo siguiente;

	public nodo (int d){
		dato=d;
		siguiente=this;
	}
}
