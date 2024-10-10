public class Software {

    private String so;
    private int versao;

    public Software(String so, int versao){
        setSo(so);
        setVersao(versao);
    }

    public void setSo(String so){
        this.so = so;
    }

    public void setVersao(int versao){
        this.versao = versao;
    }

    public String getSo(){
        return so;
    }

    public int getVersao(){
        return versao;
    }

    public String exi_info_so(){
        return ("Seu sistema é operacional: "+ so + " Sua versao do "+so+" é: "+versao);
    }










}
