package ListaCircularDoble;





public class nodo {
	public int dato;
	nodo siguiente,anterior;
	
	//constructor para cuando no hay nodos
	public nodo(int entero){
		this(entero,null,null);
	}
	//contrusctor para cuando hay nodos
	public nodo(int entero,nodo s,nodo a){
		dato=entero;
		siguiente=s;
		anterior=a;		
	}
			

	}