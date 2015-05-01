package ListaEnlazadaDoble;

public class Nodo {
public int dato;
Nodo siguiente,anterior;

public Nodo(int entero){
	this(entero,null,null);
}
//contrusctor para cuando hay nodos
public Nodo(int entero,Nodo s,Nodo a){
	dato=entero;
	siguiente=s;
	anterior=a;		
}
		//constructor para cuando no hay nodos

}
