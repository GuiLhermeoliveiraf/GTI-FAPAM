// Criando a classe Computador 
public class Computador{   
    private String marca;
    private int memoriaram;
    private int armazenamento ;

    // Contrutor
    public Computador (){
        this.marca = "Generica";
        this.memoriaram = 4; // GB
        this.armazenamento = 500; // GB
    }
    
    // Metados get e set 
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getMemoriaram(){
        return memoriaram;
    }

    public void setMemoriaram(int memoriaram){
        this.memoriaram = memoriaram;

    }

    public int getArmazenamento(){
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }

    // Metado que atualiza os valores 
    public void Atu_valores(String marca, int memoriaram, int armazenamento){
        this.marca = marca;
        this.memoriaram = memoriaram;
        this.armazenamento = armazenamento;
    }

    // Metado que exibe na tela as informações 
    public String exi_info(){
        return ("Marca: " + marca + " Memoria ram: " + memoriaram + " Armazenamento: " + armazenamento);
    }

    // Metado que define se o computador é lento ou rapido 
    public boolean ehlento(){
        return memoriaram < 8;
    }

    public String veri_velo(){
        
        String resposta="";
        
        if(ehlento()){
            resposta = "O computador é lento";
        }

        else {
            resposta = "O computador é rapido";
        }
        
        return resposta;   
    }
}   

 





