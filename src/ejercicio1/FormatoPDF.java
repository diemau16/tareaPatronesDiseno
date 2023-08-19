package ejercicio1;

public class FormatoPDF implements EstrategiaFormatoInforme {
    @Override
    public void exportarInforme() {
        System.out.println("Se ha exportado el informe en formato PDF.");
    }
}
