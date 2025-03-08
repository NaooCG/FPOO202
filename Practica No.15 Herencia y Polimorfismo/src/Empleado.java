public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    //constructores
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }
    //gets y zets
    public String getNombre() {
        return nombre;
    }
    public int getId() {
        return id;
    }
    public double getSalario() {
        return salario;
    }
    public void mostrarInfo() {
        System.out.println("-------- Informacion de Empleado --------");
        System.out.println("nombre  " + nombre);
        System.out.println(" ID  " + id);
        System.out.println("salario  $" + salario);
        System.out.println("------------------------------------");
    }
}