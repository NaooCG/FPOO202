import javax.swing.JOptionPane;
public class controlentregas {

    private int id;
    private String numguia;
    private String estado;
    //constructor
    public controlentregas() {
        this.id = id;
        this.numguia = numguia;
        this.estado = "pendiente";
    }
    //ets & sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumguia() {
        return numguia;
    }
    public void setNumguia(String numguia) {
        this.numguia = numguia;
    }
    public String getEstado() {
        return estado;
    }

    public void actualizarestado(String nuevoEstado) {
        if (nuevoEstado.equals("en camino") || nuevoEstado.equals("entregado")) {
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null, "solo se permite 'en camino' o 'entregado'  ");
        }
    }
        public void mostrarinfo() {
            System.out.println("-------informacion de la entrega -----");
            System.out.println(" id " + id);
            System.out.println(" numero de guia " + numguia);
            System.out.println(" estado " + estado);
            System.out.println("------------------------------------");
        }
    public static controlentregas crearcontrolentregas() {
        controlentregas controlentrega = new controlentregas();
        controlentrega.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese id de la entrega ")));
        controlentrega.setNumguia(JOptionPane.showInputDialog("ingrese el numero de guia de la entrega "));
        return controlentrega;
    }
}
