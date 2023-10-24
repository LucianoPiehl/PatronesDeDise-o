public class Regalo {
    private Object objeto;
    private boolean envuelto;
    private Dedicatoria dedicatoria;
    private Moño moño;
    private Papel papel;

    public boolean isEnvuelto() {
        return envuelto;
    }

    public void setEnvuelto(boolean envuelto) {
        this.envuelto = envuelto;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public Dedicatoria getDedicatoria() {
        return dedicatoria;
    }

    public void setDedicatoria(Dedicatoria dedicatoria) {
        this.dedicatoria = dedicatoria;
    }

    public Moño getMoño() {
        return moño;
    }

    public void setMoño(Moño moño) {
        this.moño = moño;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
}
