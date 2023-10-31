public abstract class Persona {
    // Atributos
    private String nombre;
    private Mediator mediator;
    private String idioma;

    public Persona(String nombre, Mediator mediator, String idioma){
        this.nombre = nombre;
        this.mediator = mediator;
        this.idioma = idioma;
    }
     String hablar(String mensaje){
        return (mensaje + " in " + getIdioma());
     }

    public String getIdioma() {
        return idioma;
    }
}
