import javax.swing.JOptionPane;

class Conductor extends Empleado {
    private String licencia;

    // Constructor
    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("--- Informacion del Conductor ---");
        System.out.println(" nombre: " + getNombre());
        System.out.println(" ID: " + getId());
        System.out.println(" salario: $" + getSalario());
        System.out.println(" licencia: " + licencia);
        System.out.println("------------------------------------");
    }
    public void conducir() {
    JOptionPane.showMessageDialog(null, getNombre() + " licencia tipo " + licencia,
            "Conduciendo", JOptionPane.INFORMATION_MESSAGE);
    }
}

