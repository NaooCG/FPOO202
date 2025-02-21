public class cuenta {

    public int idcuenta;
    int idUsuario;
    float monto;

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
