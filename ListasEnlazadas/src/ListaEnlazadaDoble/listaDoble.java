package ListaEnlazadaDoble;
import javax.swing.JOptionPane;


public class listaDoble {
Nodo inicio, fin;
	listaDoble(){
	inicio=fin=null;
	}
	//metodo para saber si la lista esta vacia
	boolean estaVacia(){
		return inicio==null;
	}
	//metodo para agregar nodos al final
	public void agregarFinal(int entero){
		if(!estaVacia()){
			fin=new Nodo(entero,null,fin);
			fin.anterior.siguiente=fin;
		}
		else{
			inicio=fin=new Nodo(entero);
		}
	}
	//metodo para agregar al inicio
	public void agregarInicio(int entero){
		if(!estaVacia()){
			inicio=new Nodo(entero,inicio,null);
			inicio.siguiente.anterior=inicio;
		}
		else{
			inicio=fin=new Nodo(entero);
		}
	}
	//metodo para mostrar la lista de inicio a fin
	public void mostrarListainicioFin(){
		if(!estaVacia()){
			String datos="<=>";
			Nodo auxiliar=inicio;
			
			while(auxiliar!=null){
				datos=datos  +"["+auxiliar.dato+"]<=>";
				auxiliar=auxiliar.siguiente;
				}
			JOptionPane.showMessageDialog(null, datos,"mostrando lista de inicio a fin",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	//metodo par mostrar la lsta de fin a inicio
	public void mostrarListaFininicio(){
		if(!estaVacia()){
			String datos="<=>";
			Nodo auxiliar=fin;
			
			while(auxiliar!=null){
				datos=datos  +"["+auxiliar.dato+"]<=>";
				auxiliar=auxiliar.anterior;
				}
			JOptionPane.showMessageDialog(null, datos,"mostrando lista de fin a inicio",JOptionPane.INFORMATION_MESSAGE);
			}
		}
}
