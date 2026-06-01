package Modelo;
public class Barril extends ObjetosInteractivos {

    // Atributo propio del Barril
    private String propietario;

    // Constructor vacío
    public Barril() {
        super("Barril del Chavo", "Café", "Cilíndrica");
        this.propietario = "El Chavo";
    }

    // Constructor con parámetros
    public Barril(String propietario, String color) {
        super("Barril de " + propietario, color, "Cilíndrica");
        this.propietario = propietario;
    }

    /**
     * Método: mostrar quién es el propietario del barril
     * @return String con el propietario
     */
    public String mostrarPropietario() {
        return "Este barril pertenece a: " + propietario;
    }

    // Getters y Setters
    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
        this.nombre = "Barril de " + propietario;
    }

    @Override
    public String toString() {
        return super.toString() + " | Propietario: " + propietario;
    }
}
