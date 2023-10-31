public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Persona frances = new Frances("Charles",mediator,"French");
        Persona chino = new Frances("li",mediator,"Chines");
        Persona italiano = new Frances("Giovanni",mediator,"Italian");
        Persona ingles = new Frances("George",mediator,"English");
        mediator.agregarPersona(frances);
        mediator.agregarPersona(chino);
        mediator.agregarPersona(italiano);
        mediator.agregarPersona(ingles);
        mediator.enviarMensaje(ingles, ingles.hablar("hola"),
                frances, frances.hablar("hola como estas"));

    }
}