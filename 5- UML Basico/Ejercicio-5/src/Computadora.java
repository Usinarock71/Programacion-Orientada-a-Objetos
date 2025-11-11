public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario; // Asociación

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        // La PlacaMadre se crea aquí, su vida depende de la Computadora
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca);
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null) {
            propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", numeroSerie=" + numeroSerie +
                ", placaMadre=" + placaMadre + ", propietario=" + (propietario != null ? propietario.getNombre() : "N/A") + "]";
    }

}
