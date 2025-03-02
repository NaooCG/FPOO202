import javax.swing.JOptionPane;
public  class conductores {
    private int id;
    private String nombre;
    private String identificacion;
    private String licencia;

    //constructores
    public conductores() {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }
    //gets & sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public void mostrarinfo() {
        System.out.println("-------informacion del conductor -----");
        System.out.println(" id " + id);
        System.out.println(" nombre " + nombre);
        System.out.println(" identificacion " + identificacion);
        System.out.println(" licencia " + licencia);
        System.out.println("------------------------------------");
    }
    public static conductores crearconductor() {
        conductores conductor = new conductores();
        conductor.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese id del conductor ")));
        conductor.setNombre(JOptionPane.showInputDialog("ingrese el nombre del conductor "));
        conductor.setIdentificacion(JOptionPane.showInputDialog("ingrese la identificacion del conductor "));
        conductor.setLicencia(JOptionPane.showInputDialog("ingrese la licencia del conductor "));
        return conductor;
    }
}
