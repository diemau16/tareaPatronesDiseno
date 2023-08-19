
package Estructural;

import javax.swing.JOptionPane;


public class Cliente {
    public static void main(String[] args) {
        String Formato = JOptionPane.showInputDialog(null, "Ingresa 'KML' o 'JSON':");
        tipoGeoJson tipogeojson = new tipoGeoJson();
        tipoKml tipokml = new tipoKml();
        if (Formato != null) {
            if (Formato.equalsIgnoreCase("KML")) {
                adaptadorGeo adaptador = new adaptador(tipokml);
                adaptador.procesarMapas();
            } else if (Formato.equalsIgnoreCase("JSON")) {
                tipogeojson.procesarGeoJson();
            } else {
                System.out.println("Formato no configurado");
            } 
        }
    }
}

