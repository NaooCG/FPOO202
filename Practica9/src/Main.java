import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //creamos el segundo objeto
        cuenta Usuario= new cuenta();
        //usar atributos
        Usuario.setIdcuenta(Integer.parseInt(JOptionPane.showInputDialog("ingrese ID de cuenta")));
        Usuario.setIdUsuario(Integer.parseInt(JOptionPane.showInputDialog("ingrese ID de Usuario")));
        Usuario.setMonto(Integer.parseInt(JOptionPane.showInputDialog("ingrese su onto disponible")));
        //invocamos metodos
        int opciones;
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog(
                    "Seleccione una opción: " +
                            "1. mostar saldo " +
                            "2. ingresar monto " +
                            "3. retirar monto " +
                            "4. depositar monto " +
                            "5. cerrar"));
            switch (opciones) {
                case 1:
                    Usuario.mostrarInfo();
                    JOptionPane.showMessageDialog(null, "saldo actual: $" + Usuario.getMonto());
                    break;
                case 2:
                    float ingreso = Float.parseFloat(JOptionPane.showInputDialog("ingresar monto:"));
                    Usuario.ingresarMonto(ingreso);
                    break;
                case 3:
                    float retiro = Float.parseFloat(JOptionPane.showInputDialog("retirar monto:"));
                    Usuario.retirarMonto(retiro);
                    break;
                case 4:
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog("depositar monto:"));
                    Usuario.depositarMonto(deposito);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "salir");
            }
        } while (opciones != 5);
    }
}