package Heroes;

public interface Heroe extends Cloneable {
    void personalizar(String nombre,String aspectoVisual);
    void incrementarEXP(int cantidad);
    void incrementarNivel(int cantidad);
    void addPuntosHabilidad(int cantidad);
    void habilidades();
    Heroe clonar();
    String getInfo();
}
