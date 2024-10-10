public class Perifericos{

    private String teclado;
    private String mouse;


    public Perifericos(String teclado, String mouse){
        setTeclado(teclado);
        setMouse(mouse);
    }

    public void setTeclado(String teclado){
        this.teclado = teclado;
    }

    public void setMouse(String mouse){
        this.mouse = mouse;
    }

    public String getTeclado(){
        return teclado;
    }

    public String gerMouse(){
        return mouse; 
    }

    public String mostra_info_mouse(){
        return ("Mouse: " + mouse + " Teclado: " + teclado);
    }

   

}
