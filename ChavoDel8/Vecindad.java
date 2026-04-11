public class Vecindad {
    private Personaje personajes;
    private ObjetoInteractivo objetos;

    public Vecindad() {}

    public Personaje getPersonajes() { 
        return personajes; 
    }
    public void setPersonajes(Personaje personajes) { 
        this.personajes = personajes; 
    }

    public ObjetoInteractivo getObjetos() { 
        return objetos; 
    }
    public void setObjetos(ObjetoInteractivo objetos) { 
        this.objetos = objetos; 
    }

    public void agregarPersonaje(Personaje p) {
        this.personajes = p;
    }

    public void agregarObjeto(ObjetoInteractivo o) {
        this.objetos = o;
    }

    public void mostrarPersonajes() {
        if (personajes != null) {
            System.out.println("Personaje: " + personajes.getNombre());
        }
    }
}