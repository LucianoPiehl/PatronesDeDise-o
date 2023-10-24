public class AñadirDedicatoria extends ManejadorDeRegalos {
    private ManejadorDeRegalos siguienteManejador;

    public void setSiguienteManejador(ManejadorDeRegalos siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    @Override
    public void procesarRegalo(Regalo regalo) {
        Dedicatoria dedicatoria= new Dedicatoria();
        regalo.setDedicatoria(dedicatoria);      // ...

        // Si hay un siguiente manejador, pásale el regalo
        if (siguienteManejador != null) {
            siguienteManejador.procesarRegalo(regalo);
        }
    }
}
