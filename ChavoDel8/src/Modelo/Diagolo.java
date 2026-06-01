package Modelo;
import Modelo.Personaje;
import java.util.ArrayList;
import java.util.List;


public class Diagolo {

    // Lista de personajes que participan en el diálogo
    private List<Personaje> interaccion;
    private String contenido;

    // Constructor
    public Diagolo() {
        this.interaccion = new ArrayList<>();
        this.contenido = "";
    }

    public Diagolo(String contenido) {
        this.interaccion = new ArrayList<>();
        this.contenido = contenido;
    }

    /**
     * Inicia el diálogo entre los personajes cargados
     * @return String con el diálogo generado
     */
    public String iniciarDialogo() {
        if (interaccion.isEmpty()) {
            return "No hay personajes para dialogar.";
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("=== INICIO DE DIÁLOGO ===\n");

        for (Personaje p : interaccion) {
            resultado.append(p.getNombre()).append(": ").append(contenido).append("\n");
        }

        return resultado.toString();
    }

    /**
     * Finaliza el diálogo
     * @return String indicando el fin del diálogo
     */
    public String finalizarDialogo() {
        String resumen = "=== FIN DE DIÁLOGO ===\nParticiparon: ";
        for (int i = 0; i < interaccion.size(); i++) {
            resumen += interaccion.get(i).getNombre();
            if (i < interaccion.size() - 1) {
                resumen += ", ";
            }
        }
        interaccion.clear();
        contenido = "";
        return resumen;
    }

    /**
     * Agrega un personaje al diálogo
     * @param p Personaje a agregar
     */
    public void agregarPersonaje(Personaje p) {
        interaccion.add(p);
    }

    // Getters y Setters
    public List<Personaje> getInteraccion() {
        return interaccion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
