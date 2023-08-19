package ejercicio1;

public class InformeVentas implements EstrategiaTipoInforme {
    @Override
    public void crearInforme() {
        System.out.println("Generando informe de finanzas.");
        System.out.println("Accediento al historial de transacciones.");
        System.out.println("Accediendo a la base de datos de clientes.");
        System.out.println("Organizando información.");
    }
}
