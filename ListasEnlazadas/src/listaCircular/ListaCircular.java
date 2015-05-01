package listaCircular;

import javax.swing.JOptionPane;


public class ListaCircular {

	public static void main(String[] args) {
		logilaLC lista=new logilaLC();
		int opcion=0;
		int elemento;
		boolean eliminado=false;
		do{
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar nodo a la lista\n"
						+ "2.eliminar nodo\n"
						+ "3.mostrar los datos de la lista circular\n"
						+ "4.Salir\n"
						
						+ "Que desea hacer?","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1: 
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","agregando nodo a la lista ", JOptionPane.INFORMATION_MESSAGE));
					lista.insertar(elemento);
					break;
				case 2: 
					if(!lista.estaVacia()){
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo a eliminar","eliminando nodo de la lista", JOptionPane.INFORMATION_MESSAGE));
					eliminado=lista.eliminar(elemento);
					if(eliminado){
						JOptionPane.showMessageDialog(null, "el elemento eliminado es"+ elemento, "eliminando nodo",JOptionPane.INFORMATION_MESSAGE );
						
					}
					else {
						JOptionPane.showMessageDialog(null, "el elemento no esta en la lista", "elemento no encontrado",JOptionPane.INFORMATION_MESSAGE );
					}
					
					break;
					}
					else{
						JOptionPane.showMessageDialog(null, "La lista esta vacia", "elemento no encontrado",JOptionPane.INFORMATION_MESSAGE );
					}
				case 3: if(!lista.estaVacia()){
					lista.mostrarLista();
					}
				else{
					JOptionPane.showMessageDialog(null, "no hay nodos aun", "lista vacia",JOptionPane.INFORMATION_MESSAGE );
				}
					
					break;
				case 4:JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
					break;
				
					default:JOptionPane.showMessageDialog(null, "Error opcion no valida", "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
				}
				
				
			}
			catch(NumberFormatException n){
				JOptionPane.showMessageDialog( null, "error" +n.getMessage());
			}
			
		}
		
		while(opcion!=4);{
	
	}

	}

}
