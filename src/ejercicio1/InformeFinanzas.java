package ejercicio1;

public class InformeFinanzas implements EstrategiaTipoInforme {
    @Override
    public void crearInforme() {
        System.out.println("Generando informe de finanzas.");
        System.out.println("Accediendo a los registros de contaduría.");
        System.out.println("Realizando operaciones.");
        System.out.println("Generando gráficos.");
    }
}
