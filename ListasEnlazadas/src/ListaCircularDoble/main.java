package ListaCircularDoble;



import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		logica lista=new logica();
		int opcion=0;
		int elemento;
		
		do{
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar nodo al inicio\n"
					
						+ "2.mostrar lista \n"
						
						+ "3.Salir\n"
						+ "Que desea hacer?","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1: 
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","agregando nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
					lista.agregarInicio(elemento); break;
				
				case 2: if(!lista.estaVacia()){
					lista.mostrarListainicioFin(); 
					}
				else{
					JOptionPane.showMessageDialog(null, "no hay nodos aun", "lista vacia",JOptionPane.INFORMATION_MESSAGE );
				}
					
					case 3:JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",JOptionPane.INFORMATION_MESSAGE );
					break;
					default:JOptionPane.showMessageDialog(null, "Error opcion no valida", "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
				}
				
				
			}
			catch(NumberFormatException n){
				JOptionPane.showMessageDialog( null, "error" +n.getMessage());
			}
			
		}
		
		while(opcion!=3);{
	
	}
	
	}

}
