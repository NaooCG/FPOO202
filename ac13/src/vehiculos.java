import javax.swing.JOptionPane;
public class vehiculos {

    private int id;
    private String placa;
    private String modelo;
    private float capacidadcarga;
    private conductores conductor;

    //constructor
    public vehiculos() {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadcarga = capacidadcarga;
        this.conductor = null;
    }
    //gets & sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getCapacidadcarga() {
        return capacidadcarga;
    }
    public void setCapacidadcarga(float capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }
    public conductores getConductor() {
        return conductor;
    }
    public void asignarconductor(conductores conductor) {
        if (this.conductor == null) {
            this.conductor = conductor;
        } else {
            JOptionPane.showMessageDialog(null, "vehiculo ya tiene conductor   ");
        }
    }

    public void mostrarinfo() {
        System.out.println("-------informacion del vehiculo -----");
        System.out.println(" id " + id);
        System.out.println(" placa " + placa);
        System.out.println(" modelo " + modelo);
        System.out.println(" capacidad de carga " + capacidadcarga);
        System.out.println(" conductor " + (conductor != null ? conductor.getNombre() : "no asignado"));
        System.out.println("------------------------------------");
    }

    public static vehiculos crearvehiculo() {
        vehiculos vehiculo = new vehiculos();
        vehiculo.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese id del vehiculo ")));
        vehiculo.setPlaca(JOptionPane.showInputDialog("ingrese placa del vehiculo "));
        vehiculo.setModelo(JOptionPane.showInputDialog("ingrese el modelo de vehiculo "));
        vehiculo.setCapacidadcarga(Float.parseFloat(JOptionPane.showInputDialog("ingrese la capacidad de carga del vehiculo ")));
        return vehiculo;
    }
}
