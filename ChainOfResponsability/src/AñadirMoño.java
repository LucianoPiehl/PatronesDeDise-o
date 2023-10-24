public class AñadirMoño extends ManejadorDeRegalos {
    private ManejadorDeRegalos siguienteManejador;

    public void setSiguienteManejador(ManejadorDeRegalos siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    @Override
    public void procesarRegalo(Regalo regalo) {
        Moño moño= new Moño();
        moño.setColor("Rojo");
        regalo.setMoño(moño);
        // Si hay un siguiente manejador, pásale el regalo
        if (siguienteManejador != null) {
            siguienteManejador.procesarRegalo(regalo);
        }
    }
}
