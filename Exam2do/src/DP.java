import javax.swing.*;
public class DP {
    private String nombre;
    private String apellido_paterno;
    private String Apellido_materno;
    private int ano_nacimiento;
    private String carrera;

    public DP(String nombre, String apellido_paterno, String apellido_materno, int ano_nacimiento, String carrera) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.Apellido_materno = apellido_materno;
        this.ano_nacimiento = ano_nacimiento;
        this.carrera = carrera;
    }
    public void pedirDP(){
        this.nombre =JOptionPane.showInputDialog("ingresa tu nombre: ");
        this.apellido_paterno=JOptionPane.showInputDialog("ingresa tu apellido paterno");
        this.Apellido_materno=JOptionPane.showInputDialog("ingresa tu apellido materno");
        this.ano_nacimiento=Integer.parseInt(JOptionPane.showInputDialog("ingresa tu ano de nacimiento"));
        this.carrera=JOptionPane.showInputDialog("ingresa tu carrera");

    }
    public class Main {
        public static void main(String[] args) {
            DP dp= new DP(" "," "," ",0," ");
            dp.pedirDP();

        }
    }
}
