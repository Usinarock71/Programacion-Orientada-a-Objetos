public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular;      // Asociación

    public CuentaBancaria(String cbu, double saldo, String codigoClave) {
        this.cbu = cbu;
        this.saldo = saldo;
        // La ClaveSeguridad se crea y vive dentro de la CuentaBancaria
        this.clave = new ClaveSeguridad(codigoClave);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave +
                ", titular=" + (titular != null ? titular.getNombre() : "N/A") + "]";
    }
}
