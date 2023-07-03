import javax.swing.JOptionPane;

public class MenuPrincipal {
    public int mostrarMenuPrincipal() {
        String[] opciones = {"Convertir Monedas", "Convertir Masa"};
        return JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
    }
}
