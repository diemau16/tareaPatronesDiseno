
package Estructural;

public class adaptador implements  adaptadorGeo {
    private tipoKml tipokml;

    public adaptador(tipoKml tipokml) {
        this.tipokml = tipokml;
    }

    @Override
    public void procesarMapas() {
        tipokml.procesarKml();
    }
}
