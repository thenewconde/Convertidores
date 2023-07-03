import javax.swing.JOptionPane;


class ConverterDivisa {
    public void convertir() {
        boolean continuar = true;
        while (continuar) {
            String[] monedas = {"Euro", "Dolar", "Yen Japones", "CRC"};

            int opcion1 = JOptionPane.showOptionDialog(null, "Seleccione la primera unidad:", "Conversor de Divisa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, monedas, null);

            int opcion2 = JOptionPane.showOptionDialog(null, "Seleccione la segunda unidad:", "Conversor de Divisa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, monedas, null);

            double valor = obtenerValorNumerico("Ingrese el valor a convertir:");
            double resultado = 0.0;

            switch (opcion1) {
                case 0: // Euro
                    switch (opcion2) {
                        case 0: // Euro
                            resultado = valor;
                            break;
                        case 1: // Dolar
                            resultado = valor * 1.08;
                            break;
                        case 2: // Yen
                            resultado = valor * 157.30;
                            break;
                        case 3: // CRC
                            resultado = valor * 590;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 1: // Dolar
                    switch (opcion2) {
                        case 0: // Euro
                            resultado = valor * 0.92;
                            break;
                        case 1: // Dolar
                            resultado = valor;
                            break;
                        case 2: // Yen
                            resultado = valor * 145.01;
                            break;
                        case 3: // CRC
                            resultado = valor * 540;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 2: // Yen
                    switch (opcion2) {
                        case 0: // Euro
                            resultado = valor * 0.0064;
                            break;
                        case 1: // Dolar
                            resultado = valor * 0.0069;
                            break;
                        case 2: // Yen
                            resultado = valor;
                            break;
                        case 3: // CRC
                            resultado = valor * 3.75;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Segunda unidad inválida.");
                            break;
                    }
                    break;
                case 3: // CRC
                    switch (opcion2) {
                        case 0: // Euro
                            resultado = valor * 0.0017;
                            break;
                        case 1: // Dolar
                            resultado = valor * 0.0018;
                            break;
                        case 2: // Yen
                            resultado = valor * 0.27;
                            break;
                        case 3: // CRC
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
