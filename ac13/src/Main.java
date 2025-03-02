import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        vehiculos vehiculo = null;
        conductores conductor = null;
        registroenvios registroenvio = null;
        controlentregas controlentrega = null;

    int opciones;
    while(true){
        opciones = Integer.parseInt(JOptionPane.showInputDialog(
         "selecciona una opcion \n" +
                 "1. registar vehiculo\n " +
                 "2. registar conductor\n " +
                 "3. asiganar conductor a vehiculo\n " +
                 "4. registar envio\n " +
                 "5. registar entrega\n " +
                 "6. actualizar estado entrega\n " +
                 "7. mostar informacion\n " +
                 "8. salir "));

    switch (opciones) {
        case 1:
            vehiculo = vehiculos.crearvehiculo();
            JOptionPane.showMessageDialog(null, "vehiculo registrado  ");
            break;
        case 2:
            conductor = conductores.crearconductor();
            JOptionPane.showMessageDialog(null, "conductor registrado  ");
            break;
        case 3:
            if (vehiculo != null && conductor != null) {
                vehiculo.asignarconductor(conductor);
                JOptionPane.showMessageDialog(null, "conductor asignado al vehiculo   ");
            }else {
                JOptionPane.showMessageDialog(null, "registre un vehiculo y un conductor  ");
            }
            break;
        case 4:
            registroenvio = registroenvios.crearregistroenvios();
            JOptionPane.showMessageDialog(null, "envio registrado  ");
            break;
        case 5:
            controlentrega = controlentregas.crearcontrolentregas();
            JOptionPane.showMessageDialog(null, "entrega registrada ");
            break;
        case 6:
            if (controlentrega != null) {
                String nuevoEstado = JOptionPane.showInputDialog("engresa el nuevo estado de la entrega (en cmino / entregado) ");
                controlentrega.actualizarestado(nuevoEstado);
        } else {
                JOptionPane.showMessageDialog(null, "registra una entrega  ");
        }
            break;
        case 7:
            if (vehiculo != null) {
                vehiculo.mostrarinfo();
            } else {
                JOptionPane.showMessageDialog(null, "no hay vehiculo registrado");
            }
            if (conductor != null) {
                conductor.mostrarinfo();
            } else {
                JOptionPane.showMessageDialog(null, "no existe conductor");
            }
            if (registroenvio != null) {
                registroenvio.mostrarinfo();
            } else {
                JOptionPane.showMessageDialog(null, "no hay envio registrado");
            }
            if (controlentrega != null) {
                controlentrega.mostrarinfo();
            } else {
                JOptionPane.showMessageDialog(null, "no hay entrega registrada");
            }
            break;
        case 8:
            JOptionPane.showMessageDialog(null, "salir");
            System.exit(0);
            break;
        default:
            JOptionPane.showMessageDialog(null, "intente de nuevo");
            break;
   }
  }
 }
}