package listaCircular;

import javax.swing.JOptionPane;


public class logilaLC {
nodo ultimo;

	logilaLC(){
		ultimo=null;
	}
	//metodo para cuando la lista esta vacia
	boolean estaVacia(){
		return ultimo==null;
	}
	//metodo para insertar nodos
	public logilaLC insertar(int elemento){
		nodo nuevo=new nodo(elemento);
		if(ultimo!=null){
			nuevo.siguiente=ultimo.siguiente;
			ultimo.siguiente=nuevo;
		}
		ultimo=nuevo;
		return this;
	}
	//metodo para eliminar nodo de  la lista!
	boolean eliminar(int elemento){
		nodo actual;
		boolean encontrar=false;
		actual=ultimo;
		while(actual.siguiente!=ultimo && !encontrar){
			encontrar=(actual.siguiente.dato==elemento);
			if(!encontrar){
				 actual=actual.siguiente;
			}
		}
		encontrar=(actual.siguiente.dato==elemento);
		if(encontrar){
			nodo auxiliar=actual.siguiente;
			if(ultimo==ultimo.siguiente){
				ultimo=null;
			}
			else{
				if(auxiliar==ultimo){
					ultimo=actual;
				}
				actual.siguiente=auxiliar.siguiente;
			}
			auxiliar=null;
		}
		return encontrar==true;
	}
	
	//metodo para mostrar la lista
	public void mostrarLista(){
		nodo auxiliar=ultimo.siguiente;
		String cadena="";
		do{
			cadena=cadena+"["+auxiliar.dato+"]->";
			auxiliar=auxiliar.siguiente;
		}while(auxiliar!=ultimo.siguiente);
		JOptionPane.showMessageDialog(null, cadena,"mostrando la lista circular",JOptionPane.INFORMATION_MESSAGE);
		
	}
}