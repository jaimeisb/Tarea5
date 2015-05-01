import javax.swing.JOptionPane;



public class Main {

	public static void main(String[] args) {
	listaDoble lista=new listaDoble();
		int opcion=0;
		int elemento;
		
		do{
			try{
				opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar nodo al inicio\n"
						+ "2.Agregar nodo al final\n"
						+ "3.mostrar lista de inicio a Fin\n"
						+ "4.mostrar lista de fin a inicio\n"
						+ "5.Salir"
						+ "Que desea hacer?","Menu de opciones",JOptionPane.INFORMATION_MESSAGE));
				
				switch(opcion){
				case 1: 
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","agregando nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
					lista.agregarInicio(elemento); break;
				case 2: 
					elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el elemento del nodo","agregando nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
					
					lista.agregarFinal(elemento);
					break;
				case 3: if(!lista.estaVacia()){
					lista.mostrarListainicioFin(); 
					}
				else{
					JOptionPane.showMessageDialog(null, "no hay nodos aun", "lista vacia",JOptionPane.INFORMATION_MESSAGE );
				}
					
					break;
				case 4:if(!lista.estaVacia()){
					lista.mostrarListaFininicio(); 
					}
				else{
					JOptionPane.showMessageDialog(null, "no hay nodos aun", "lista vacia",JOptionPane.INFORMATION_MESSAGE );
				}
					break;
				case 5:JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",JOptionPane.INFORMATION_MESSAGE );
					break;
					default:JOptionPane.showMessageDialog(null, "Error opcion no valida", "Incorrecto",JOptionPane.INFORMATION_MESSAGE );
				}
				
				
			}
			catch(NumberFormatException n){
				JOptionPane.showMessageDialog( null, "error" +n.getMessage());
			}
			
		}
		
		while(opcion!=5);{
	
	}
	}
}
