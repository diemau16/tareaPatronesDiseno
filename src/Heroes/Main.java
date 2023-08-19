package Heroes;

public class Main {
    public static void main(String[] args) {
        GestorHeroes gestorHeroes = new GestorHeroes();

        Heroe prototipoGuerrero = new Guerrero("Guerrero uno", "Gordo");
        prototipoGuerrero.incrementarEXP(100);
        prototipoGuerrero.incrementarNivel(100);
        prototipoGuerrero.addPuntosHabilidad(5);

        Heroe guerreroCopiado = prototipoGuerrero.clonar();
        guerreroCopiado.personalizar("Guerrero clonado", "Alto");


        gestorHeroes.AgregarHeroe("1", prototipoGuerrero);
        gestorHeroes.AgregarHeroe("2", guerreroCopiado);

        for (String idHeroe : gestorHeroes.getIdHeroes()) {
            Heroe hero = gestorHeroes.getHeroe(idHeroe);
            System.out.println(hero.getInfo());
            hero.habilidades();
            System.out.println();
        }
    }
}