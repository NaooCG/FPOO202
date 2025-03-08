import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Empleado> empleados =new ArrayList<>();

    public static void main(String[] args) {
        while (true) {

    String[] opciones = {" agrega un empleado ", " lista de empleados", "salir"};
     int opcion=JOptionPane.showOptionDialog(null," selecciona","MENU",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
     switch (opcion) {
          case 0:
              agregarEmpleado();
              break;
          case 1:
              listarEmpleados();
              break;
          case 2:
              JOptionPane.showMessageDialog(null, " salir");
              return;
              default:
              JOptionPane.showMessageDialog(null, " opcion no valida");
            }
        }
    }
    private static void agregarEmpleado() {
        String[] tiposEmpleado = {" conductor", "administrativos", "empleado "};
        int tipo = JOptionPane.showOptionDialog(null, "seleccione el tipo de empleado ",
                "agrega un empleado", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tiposEmpleado,
                tiposEmpleado[0]);
        String nombre = JOptionPane.showInputDialog("ingresa el nombre ");
        int id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el ID "));
        double salario = Double.parseDouble(JOptionPane.showInputDialog("ingresa el salario "));

        switch (tipo) {
            case 0:
                String licencia = JOptionPane.showInputDialog("ingresa tipo de licencia de conductor ");
                empleados.add(new Conductor(nombre, id, salario, licencia));
                break;
            case 1:
                String departamento = JOptionPane.showInputDialog("ingresa el departamento del administrativo ");
                empleados.add(new Administrativo(nombre, id, salario, departamento));
                break;
            case 2:
                empleados.add(new Empleado(nombre, id, salario));
                break;
            default:
                JOptionPane.showMessageDialog(null, "tipo de empleado no valido  ");
        }
        JOptionPane.showMessageDialog(null, " empleado agregado  ");
    }
    private static void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, " no hay registros  ");
            return;
        }
        StringBuilder lista = new StringBuilder(" lista de empleados  \n");
        for (Empleado empleado : empleados) {
            lista.append("nombre: ").append(empleado.getNombre())
                    .append(", ID: ").append(empleado.getId())
                    .append(", salario: $").append(empleado.getSalario()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
        }
    }
}