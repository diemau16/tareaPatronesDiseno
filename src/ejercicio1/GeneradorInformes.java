package ejercicio1;

public class GeneradorInformes {
    public void generarInforme(EstrategiaTipoInforme tipoInforme, EstrategiaFormatoInforme formatoInforme) {
        tipoInforme.crearInforme();
        formatoInforme.exportarInforme();
    }
}
