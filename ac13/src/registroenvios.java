import javax.swing.JOptionPane;
public class registroenvios {

    private int id;
    private String codigoenvio;
    private String destino;
    private float peso;
    //constructor
    public registroenvios() {
        this.id = id;
        this.codigoenvio = codigoenvio;
        this.destino = destino;
        this.peso = peso;
    }
    //gets & seets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCodigoenvio() {
        return codigoenvio;
    }
    public void setCodigoenvio(String codigoenvio) {
        this.codigoenvio = codigoenvio;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void mostrarinfo() {
        System.out.println("-------informacion del envio -----");
        System.out.println(" id " + id);
        System.out.println(" codigo de envio " + codigoenvio);
        System.out.println(" destino " + destino);
        System.out.println(" peso " + peso);
        System.out.println("------------------------------------");
    }

    public static registroenvios crearregistroenvios() {
        registroenvios registroenvio = new registroenvios();
        registroenvio.setId(Integer.parseInt(JOptionPane.showInputDialog("ingrese id del envio ")));
        registroenvio.setCodigoenvio(JOptionPane.showInputDialog("digita codigo de envio "));
        registroenvio.setDestino(JOptionPane.showInputDialog("ingresa destinatario de envio "));
        registroenvio.setPeso(Float.parseFloat(JOptionPane.showInputDialog("nngresa el peso del envio ")));
        return registroenvio;

    }
}
