import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int totalPlatos = 0;
        int totalPlatosTipicos = 0;
        int totalPlatosCarta = 0;
        int totalPlatosInternacionales = 0;
        double totalValor = 0;

        String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Nombre de Usuario", JOptionPane.PLAIN_MESSAGE);

        int codMenuPpal;
        do {
            String menu = "MENÚ RESTAURANTE\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opción: ";

            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.PLAIN_MESSAGE));

            switch (codMenuPpal) {
                case 1:
                    int codMenuTipico;
                    do {
                        String menuTipico = "MENÚ TÍPICO\n\n";
                        menuTipico += "1. Frijoles ($12,000)\n";
                        menuTipico += "2. Sopa de Verduras ($8,000)\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opción: ";

                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(null, menuTipico, "Menú Típico", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuTipico) {
                            case 1:
                                totalPlatos++;
                                totalPlatosTipicos++;
                                totalValor += 12000;
                                break;
                            case 2:
                                totalPlatos++;
                                totalPlatosTipicos++;
                                totalValor += 8000;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea Repetir"
                                + " el menu tipico, de lo contrario regresara al menu principal "));
                        if (codMenuTipico != 1) {
                            codMenuTipico = 3;
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    int codMenuCarta;
                    do {
                        String menuCarta = "MENÚ A LA CARTA\n\n";
                        menuCarta += "1. Bistec ($20,000)\n";
                        menuCarta += "2. Pollo a la plancha ($18,000)\n";
                        menuCarta += "3. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opción: ";

                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(null, menuCarta, "Menú a la Carta", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuCarta) {
                            case 1:
                                totalPlatos++;
                                totalPlatosCarta++;
                                totalValor += 20000;
                                break;
                            case 2:
                                totalPlatos++;
                                totalPlatosCarta++;
                                totalValor += 18000;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea Repetir"
                                + " el menu a la carta, de lo contrario regresara al menu principal "));
                        if (codMenuCarta != 1) {
                            codMenuCarta = 3;
                        }
                    } while (codMenuCarta != 3);
                    break;
                case 3:
                    int codMenuInternacional;
                    do {
                        String menuInternacional = "MENÚ INTERNACIONAL\n\n";
                        menuInternacional += "1. Pizza ($25,000)\n";
                        menuInternacional += "2. Sushi ($30,000)\n";
                        menuInternacional += "3. Regresar\n\n";
                        menuInternacional += "Por favor seleccione una opción: ";

                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(null, menuInternacional, "Menú Internacional", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuInternacional) {
                            case 1:
                                totalPlatos++;
                                totalPlatosInternacionales++;
                                totalValor += 25000;
                                break;
                            case 2:
                                totalPlatos++;
                                totalPlatosInternacionales++;
                                totalValor += 30000;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea Repetir"
                                + " el menu internacional, de lo contrario regresara al menu principal "));
                        if (codMenuInternacional != 1) {
                            codMenuInternacional = 3;
                        }
                    } while (codMenuInternacional != 3);
                    break;
                case 4:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);

        String factura = "Factura\n\n";
        factura += "Nombre del usuario: " + nombreUsuario + "\n";
        factura += "Cantidad de platos típicos: " + totalPlatosTipicos + "\n";
        factura += "Cantidad de platos a la carta: " + totalPlatosCarta + "\n";
        factura += "Cantidad de platos internacionales: " + totalPlatosInternacionales + "\n";
        factura += "Total de platos procesados: " + totalPlatos + "\n";
        factura += "Valor total a pagar: $" + totalValor + "\n";

        JOptionPane.showMessageDialog(null, factura, "Factura", JOptionPane.PLAIN_MESSAGE);
    }
}
