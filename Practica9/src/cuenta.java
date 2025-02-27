public class cuenta {

    private int idcuenta;

    private int idUsuario;
    private float monto;

    //constructores
    public cuenta() {
        this.idcuenta = idcuenta;
        this.idUsuario = idUsuario;
        this.monto = monto;
    }

    //zona gets & zets
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getIdcuenta() {
        return idcuenta;
    }
    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void mostrarInfo(){
        System.out.println("-------informacion de la cuenta -----");
        System.out.println(" ID Cuenta " + idcuenta);
        System.out.println(" ID de Urusario " + idUsuario);
        System.out.println(" monto disponible " + monto);
        System.out.println("------------------------------------");
    } // cerrar mostar

    public void ingresarMonto(float cantidad){
        monto += cantidad;
        System.out.println(" monto ingresando " + cantidad);
        System.out.println(" monto final " + monto);
    }

    public void retirarMonto(float cantidad){
        if (cantidad > 0 && cantidad <= monto){
            monto -= cantidad;
            System.out.println(" monto retirado " + cantidad);
        } else {
            System.out.println(" monto insuficiente " + cantidad);
        }
    }

    public void depositarMonto(float cantidad) {
        ingresarMonto(cantidad);
        System.out.println("monto depositado: $" + cantidad);
    }
}
