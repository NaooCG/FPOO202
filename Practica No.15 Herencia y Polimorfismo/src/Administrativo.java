import javax.swing.JOptionPane;

class Administrativo extends Empleado {
    private String departamento;

    //constructor
    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("--- Información del Administrativo ---");
        System.out.println("nombre: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("salario: $" + getSalario());
        System.out.println("departamento: " + departamento);
        System.out.println("------------------------------------");
    }

    public void gestionar() {
        JOptionPane.showMessageDialog(null,
                getNombre() + " esta en el departamento de " + departamento,
                "gestionando", JOptionPane.INFORMATION_MESSAGE);
    }
}
