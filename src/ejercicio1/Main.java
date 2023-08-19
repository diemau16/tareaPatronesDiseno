package ejercicio1;

public class Main {
    public static void main(String[] args) {
        GeneradorInformes generadorInformes = new GeneradorInformes();
        generadorInformes.generarInforme(new InformeProduccion(), new FormatoPDF());
    }
}
