public class ObjetoInteractivo {
    protected String nombre;

    public ObjetoInteractivo() {}

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void usar() {
        System.out.println("Usando " + nombre);
    }
}