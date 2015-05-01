package ListaCircularDoble;
import javax.swing.JOptionPane;




public class logica {
	nodo inicio, fin;
	logica(){
	inicio=fin=null;
	}
		boolean estaVacia(){
			return inicio==null;
}	
		public void agregarInicio(int entero){
			if(!estaVacia()){
				inicio=new nodo(entero,inicio,fin);
				inicio.siguiente.anterior=inicio;
			}
			else{
				inicio=fin=new nodo(entero);
			}
		}
		public void mostrarListainicioFin(){
			if(!estaVacia()){
				String datos="<=>";
				nodo auxiliar=inicio;
				
				while(auxiliar!=null){
					datos=datos  +"["+auxiliar.dato+"]<=>";
					auxiliar=auxiliar.siguiente;
					}
				JOptionPane.showMessageDialog(null, datos,"mostrando lista de inicio a fin",JOptionPane.INFORMATION_MESSAGE);
			}
		}
}
