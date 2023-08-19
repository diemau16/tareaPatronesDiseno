package ejercicio1;

public class GeneradorInformes {
    public void generarInforme(EstrategiaTipoInforme estrategiaTipoInforme, EstrategiaFormatoInforme estrategiaFormatoInforme) {
        estrategiaTipoInforme.crearInforme();
        estrategiaFormatoInforme.exportarInforme();
    }
}
