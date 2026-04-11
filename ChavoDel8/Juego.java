public class Juego {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.nuevaVecindad();
    }

    public void nuevaVecindad() {
        Vecindad v = new Vecindad();
        crearPersonajes(v);
        crearObjetosInteractivos(v);
        agregarElementosVecindad(v);
        simularInteracciones(v);
    }

    public void crearPersonajes(Vecindad v) {
        Chavo chavo = new Chavo();
        chavo.setNombre("El Chavo");
        chavo.setEdad(8);
        v.agregarPersonaje(chavo);
    }

    public void crearObjetosInteractivos(Vecindad v) {
        Barril barril = new Barril();
        barril.setNombre("Barril");
        v.agregarObjeto(barril);
    }

    public void agregarElementosVecindad(Vecindad v) {
        System.out.println("Elementos agregados a la vecindad.");
    }

    public void simularInteracciones(Vecindad v) {
        System.out.println("Simulando interacciones en la vecindad...");
    }
}
