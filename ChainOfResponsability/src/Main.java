public class Main {
    public static void main(String[] args) {

            // Crear instancias de los manejadores
            AñadirDedicatoria manejadorDedicatoria = new AñadirDedicatoria();
            AñadirMoño manejadorMoño = new AñadirMoño();
            ElegirObjeto manejadorObjeto = new ElegirObjeto();
            EnvolverObjeto manejadorEnvoltura = new EnvolverObjeto();

            // Configurar la cadena de responsabilidad
            manejadorDedicatoria.setSiguienteManejador(manejadorMoño);
            manejadorMoño.setSiguienteManejador(manejadorObjeto);
            manejadorObjeto.setSiguienteManejador(manejadorEnvoltura);

            // Crear un regalo
            Regalo regalo = new Regalo();

            // Procesar el regalo a través de la cadena de responsabilidad
            manejadorDedicatoria.procesarRegalo(regalo);

            // Comprobar el estado del regalo después de procesarlo
            System.out.println("Estado del regalo: " + regalo.getObjeto());
            System.out.println("¿Está envuelto? " + regalo.isEnvuelto());
            System.out.println("Dedicatoria: " + regalo.getDedicatoria());
            System.out.println("Moño: " + regalo.getMoño());
        }

    }
