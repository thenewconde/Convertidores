import javax.swing.JOptionPane;

public class MenuOpciones {
    public int mostrarMenuMonedas(String mensaje, String[] monedas) {
        return JOptionPane.showOptionDialog(null, mensaje, "Conversor de Moneda",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, monedas, null);
    }

    public double obtenerValorNumerico(String mensaje) {
        String valorString;
        double valor = 0.0;
        boolean entradaValida = false;

        while (!entradaValida) {
            valorString = JOptionPane.showInputDialog(null, mensaje);

            try {
                valor = Double.parseDouble(valorString);
                entradaValida = true; // Si no se produce una excepción, la entrada es válida
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }

        return valor;
    }
}
