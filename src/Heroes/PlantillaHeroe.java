package Heroes;

public class PlantillaHeroe implements Heroe{
    protected String nombre;
    protected String aspectoVisual;
    protected int EXP;
    protected int Nivel;
    protected int puntosHabilidad;
    protected String HabilidadAtaque;
    protected String HabilidadDefensa;
    protected String HabilidadMagica;

    public PlantillaHeroe(String nombre, String aspectoVisual, String HabilidadAtaque, String HabilidadDefensa, String HabilidadMagica){
        this.nombre = nombre;
        this.aspectoVisual = aspectoVisual;
        this.EXP = 0;
        this.Nivel = 0;
        this.puntosHabilidad = 0;
        this.HabilidadAtaque = HabilidadAtaque;
        this.HabilidadDefensa = HabilidadDefensa;
        this.HabilidadMagica = HabilidadMagica;
    }

    @Override
    public void personalizar(String nombre, String aspectoVisual) {
        this.nombre = nombre;
        this.aspectoVisual = aspectoVisual;
    }

    @Override
    public void incrementarEXP(int cantidad) {
        this.EXP += cantidad;
    }

    @Override
    public void incrementarNivel(int cantidad) {
        this.Nivel += cantidad;
    }

    @Override
    public void addPuntosHabilidad(int cantidad) {
        this.puntosHabilidad += cantidad;
    }

    @Override
    public void habilidades() {
        System.out.println("Habilidad de ataque: "+HabilidadAtaque);
        System.out.println("Habilidad de defensa: "+HabilidadDefensa);
        System.out.println("Habilidad de magia: "+HabilidadMagica);
    }

    @Override
    public Heroe clonar() {
        try{
            return(Heroe) super.clone();
        } catch(CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String getInfo() {
        return "Heroe: "+nombre+" ("+aspectoVisual+")\nNivel: "+Nivel+"\nExperiencia: "+EXP+"\nPuntos de habilidad: "+puntosHabilidad;
    }
}
