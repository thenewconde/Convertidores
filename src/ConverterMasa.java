import javax.swing.JOptionPane;

public class ConverterMasa {

    public void convertirMasa() {
        boolean continuar = true;
        while (continuar) {
            String[] unidades = {"Kilo", "Gramo", "Tonelada", "Libra", "Onza"};

            int opcion1 = JOptionPane.showOptionDialog(null, "Seleccione la primera unidad:", "Conversor de Masa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, unidades, null);

            int opcion2 = JOptionPane.showOptionDialog(null, "Seleccione la segunda unidad:", "Conversor de Masa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, unidades, null);

            double valor = obtenerValorNumerico("Ingrese el valor a convertir:");
            double resultado = 0.0;

            switch (opcion1) {
                case 0: // Kilo
                    switch (opcion2) {
                        case 0: // Kilo
                            resultado = valor;
                            break;
                        case 1: // Gramo
                            resultado = valor * 1000;
                            break;
                        case 2: // Tonelada
                            resultado = valor / 1000;
                            break;
                        case 3: // Libra
                            resultado = valor * 2.205;
                            break;
                        case 4: // Onza
                            resultado = valor * 35.274;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 1: // Gramo
                    switch (opcion2) {
                        case 0: // Kilo
                            resultado = valor / 1000;
                            break;
                        case 1: // Gramo
                            resultado = valor;
                            break;
                        case 2: // Tonelada
                            resultado = valor / 1000000;
                            break;
                        case 3: // Libra
                            resultado = valor / 453.6;
                            break;
                        case 4: // Onza
                            resultado = valor / 28.35;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 2: // Tonelada
                    switch (opcion2) {
                        case 0: // Kilo
                            resultado = valor * 1000;
                            break;
                        case 1: // Gramo
                            resultado = valor * 1000000;
                            break;
                        case 2: // Tonelada
                            resultado = valor;
                            break;
                        case 3: // Libra
                            resultado = valor * 2205;
                            break;
                        case 4: // Onza
                            resultado = valor * 35274;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 3: // Libra
                    switch (opcion2) {
                        case 0: // Kilo
                            resultado = valor / 2.205;
                            break;
                        case 1: // Gramo
                            resultado = valor * 453.6;
                            break;
                        case 2: // Tonelada
                            resultado = valor / 2205;
                            break;
                        case 3: // Libra
                            resultado = valor;
                            break;
                        case 4: // Onza
                            resultado = valor * 16;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 4: // Onza
                    switch (opcion2) {
                        case 0: // Kilo
                            resultado = valor / 35.274;
                            break;
                        case 1: // Gramo
                            resultado = valor * 28.35;
                            break;
                        case 2: // Tonelada
                            resultado = valor / 35274;
                            break;
                        case 3: // Libra
                            resultado = valor / 16;
                            break;
                        case 4: // Onza
                            resultado = valor;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Primera unidad inválida.");
                    break;
            }

            JOptionPane.showMessageDialog(null, "El resultado de la conversión es: " + resultado);

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Regresando...");
                continuar = false;
                
            }
        }
    }

    private double obtenerValorNumerico(String mensaje) {
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
