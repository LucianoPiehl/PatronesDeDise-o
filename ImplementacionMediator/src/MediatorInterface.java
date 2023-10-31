public interface MediatorInterface {
    void enviarMensaje(Persona remitente, String mensaje, Persona destinatario, String respuesta);
    void agregarPersona(Persona persona);
}
