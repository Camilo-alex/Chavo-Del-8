public class Personaje {
    protected String nombre;
    protected Integer edad;
    protected String personalidad;
    protected String rol;

    public Personaje() {}

    public String getNombre() { return nombre; }
    public Integer getEdad() { return edad; }
    public String getPersonalidad() { return personalidad; }
    public String getRol() { return rol; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(Integer edad) { this.edad = edad; }
    public void setPersonalidad(String personalidad) { this.personalidad = personalidad; }
    public void setRol(String rol) { this.rol = rol; }

    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    public void mover() {
        System.out.println(nombre + " se está moviendo.");
    }

    public void interactuar(ObjetoInteractivo objeto) {
        System.out.println(nombre + " interactúa con " + objeto.getNombre());
        objeto.usar();
    }
}