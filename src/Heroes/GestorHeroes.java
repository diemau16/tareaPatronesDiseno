package Heroes;

import java.util.HashMap;
import java.util.Map;

public class GestorHeroes {
    private Map<String, Heroe> heroes;

    public GestorHeroes(){
        heroes = new HashMap<>();
    }

    public void AgregarHeroe(String id, Heroe heroe){
        heroes.put(id, heroe);
    }

    public Heroe getHeroe(String id){
        Heroe heroe = heroes.get(id);
        if (heroe == null) {
            throw new IllegalArgumentException("Héroe no encontrado");
        }
        return heroe;
    }

    public Iterable<String> getIdHeroes(){
        return heroes.keySet();
    }
}
