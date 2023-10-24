public class ElegirObjeto extends ManejadorDeRegalos {
    private ManejadorDeRegalos siguienteManejador;

    public void setSiguienteManejador(ManejadorDeRegalos siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    @Override
    public void procesarRegalo(Regalo regalo) {
        // Realizar la lógica para elegir un objeto para el regalo aquí
        // Por ejemplo, seleccionar un objeto específico y asignarlo al regalo
        regalo.setObjeto("Objeto Elegido");

        // Si hay un siguiente manejador, pásale el regalo
        if (siguienteManejador != null) {
            siguienteManejador.procesarRegalo(regalo);
        }
    }
}
