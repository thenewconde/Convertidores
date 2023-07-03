import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
  
    	 boolean continuar = true;
         
         while (continuar) {
             String[] opciones = {"Convertir Divisas", "Convertir Masa", "Salir"};

             int opcionPrincipal = JOptionPane.showOptionDialog(null, "Seleccione el convertidor:", "Proyecto de Steven Mora Ceciliano",
                     JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);

             switch (opcionPrincipal) {
                 case 0: // Convertir Divisas
                     ConverterDivisa conversorDivisa = new ConverterDivisa();
                     conversorDivisa.convertir();
                     break;
                 case 1: // Convertir Masa
                     ConverterMasa conversorMasa = new ConverterMasa();
                     conversorMasa.convertirMasa();
                     break;
                 case 2: // Salir
                     continuar = false;
                     JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "Opción inválida.");
                     break;
             }
         }
     }
 }
    			
        	
        	




/*ESTA ES UNA FORMA DE HACERLO
 * NO RETORNA AL MENU
 * 
MenuPrincipal menuPrincipal = new MenuPrincipal();
int opcionPrincipal = menuPrincipal.mostrarMenuPrincipal();

if (opcionPrincipal == 0) {
	ConverterDivisa controlador = new ConverterDivisa();
	controlador.convertir();
	
} else if (opcionPrincipal == 1) {
	ConverterMasa controlador = new ConverterMasa();
	controlador.convertirMasa();
 * 
 * 
 * ESTA SOLO ES PARA UNA CLASE
 * ESTA ES UNA FORMA DE HACERLO
 * public class ConverterMoneda {
    public static void main(String[] args) {
        MenuOpciones menuOpciones = new MenuOpciones();

        String[] monedas = {"Euro", "Dolar", "Yen Japones", "CRC"};
        int opcion1 = menuOpciones.mostrarMenuMonedas("Seleccione la primera unidad:", monedas);
        int opcion2 = menuOpciones.mostrarMenuMonedas("Seleccione la segunda unidad:", monedas);

        opcion1++;
        opcion2++;

        ConverterDivisa controlador = new ConverterDivisa();
        controlador.convertir(opcion1, opcion2);
    }
}*/
