package Modelo;

public class Chavo extends Personaje {

    // Constructor
    public Chavo() {
        // Se llama al constructor del padre con los datos del Chavo
        super("El Chavo", 8, "Inocente y travieso", "Protagonista");
    }

    // Constructor personalizado
    public Chavo(String nombre, int edad, String personalidad, String rol) {
        super(nombre, edad, personalidad, rol);
    }

    public String pedirTorta() {
        return nombre + " dice: '¡Una tortita de jamón, por favor...' (fue sin querer queriendo :C)";
    }


    @Override
    public String movilizarse() {
        return nombre + " sale corriendo del barril hacia la vecindad.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nAcción especial: ¿Me regalas una Torta?";
    }
}
