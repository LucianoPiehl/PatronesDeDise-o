import java.util.ArrayList;
import java.util.List;

public class Mediator implements MediatorInterface{
    private List<Persona> listaPersona = new ArrayList();
    @Override
    public void enviarMensaje(Persona remitente,String mensaje, Persona destinatario,String respuesta) {
            for(Persona p: listaPersona){
                if(p.getIdioma().equals(destinatario.getIdioma())){
                    System.out.println(mensaje);
                    System.out.println("Traduciendo al " + destinatario.getIdioma());
                    System.out.println(respuesta);
                    System.out.println("Traduciendo al " + remitente.getIdioma());
                }
            }
    }

    @Override
    public void agregarPersona(Persona persona) {
        listaPersona.add(persona);
    }
}
