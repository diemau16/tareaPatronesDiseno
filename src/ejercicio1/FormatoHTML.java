package ejercicio1;

public class FormatoHTML implements EstrategiaFormatoInforme {
    @Override
    public void exportarInforme() {
        System.out.println("Se ha exportado el informe en formato HTML.");
    }
}
