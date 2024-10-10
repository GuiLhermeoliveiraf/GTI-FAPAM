public class Hadrware{
    private String processador;
    private int memoria;
    private int armazenamento;

    public Hadrware(String processador, int memoria, int armazenamento){
        setProcessador(processador);
        setMemoria(memoria);
        setArmazenamento(armazenamento);
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }

    public String getProcessador(){
        return processador;
    }

    public int getMemoria(){
        return memoria;
    }

    public int getArmazanamento(){
        return armazenamento;
    }

    public String mostra_info(){
        return ("Marca: " + processador + " Memoria ram: " + memoria + " Armazenamento: " + armazenamento);
    }




}
