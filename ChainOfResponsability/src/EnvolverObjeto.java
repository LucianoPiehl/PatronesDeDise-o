public class EnvolverObjeto extends ManejadorDeRegalos {
    private ManejadorDeRegalos siguienteManejador;

    public void setSiguienteManejador(ManejadorDeRegalos siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }

    @Override
    public void procesarRegalo(Regalo regalo) {
        // Realizar la lógica para envolver el objeto del regalo aquí
        // Por ejemplo, envolver el objeto con papel de regalo
        regalo.setEnvuelto(true);

        // Si hay un siguiente manejador, pásale el regalo
        if (siguienteManejador != null) {
            siguienteManejador.procesarRegalo(regalo);
        }
    }
}
