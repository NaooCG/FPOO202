import javax.swing.JOptionPane;
import java.util.Random;

public class DSP {
    public static void main(String[] args) {
        generarMatricula();
    }

    private static void generarMatricula() {
        String nombre = JOptionPane.showInputDialog("ingresa tu nombre:");
        String apellidoPaterno = JOptionPane.showInputDialog("ingresa tu apellido paterno:");
        String apellidoMaterno = JOptionPane.showInputDialog("ingresa tu apellido materno:");
        String añoNacimiento = JOptionPane.showInputDialog("ingresa tu año de nacimiento (00/00/00):");
        String carrera = JOptionPane.showInputDialog("ingresa tu carrera:");

        if (nombre == null || apellidoPaterno == null || apellidoMaterno == null || añoNacimiento == null || carrera == null ||
                nombre.trim().isEmpty() || apellidoPaterno.trim().isEmpty() || apellidoMaterno.trim().isEmpty() ||
                añoNacimiento.trim().isEmpty() || carrera.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "");
            return;
        }

        Estudiante estudiante = new Estudiante(nombre, apellidoPaterno, apellidoMaterno, añoNacimiento, carrera);
        String matricula = estudiante.generarMatricula();

        JOptionPane.showMessageDialog(null, "tu matricula es: " + matricula);
    }
}
class Estudiante {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String añoNacimiento;
    private String carrera;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, String añoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.añoNacimiento = añoNacimiento;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String generarMatricula() {
        char primeraLetraNombre = nombre.toUpperCase().charAt(0);
        String dosLetrasApellidoPaterno = apellidoPaterno.toUpperCase().substring(0, Math.min(2, apellidoPaterno.length()));
        String dosLetrasApellidoMaterno = apellidoMaterno.toUpperCase().substring(0, Math.min(2, apellidoMaterno.length()));
        String dosUltimosAñoNacimiento = añoNacimiento.substring(Math.max(0, añoNacimiento.length() - 2));
        String tresLetrasCarrera = carrera.toUpperCase().substring(0, Math.min(3, carrera.length()));

        Random random = new Random();
        int digito1 = random.nextInt(10);
        int digito2 = random.nextInt(10);
        String dosDigitosAleatorios = String.valueOf(digito1) + String.valueOf(digito2);

        return primeraLetraNombre + dosLetrasApellidoPaterno + dosLetrasApellidoMaterno +
                dosUltimosAñoNacimiento + java.time.Year.now().getValue() % 100 + tresLetrasCarrera + dosDigitosAleatorios;
    }
}