public class Motor {
    private String tipo;
    private int pontencia;

    public Motor(String tipo, int pontencia) {
        setTipo(tipo);
        setPontencia(pontencia);
    }
    
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void setPontencia(int pontencia) {
        this.pontencia = pontencia;
    }


    public String getTipo() {
        return tipo;
    }

    public int getPontencia() {
        return pontencia;
    }

}
