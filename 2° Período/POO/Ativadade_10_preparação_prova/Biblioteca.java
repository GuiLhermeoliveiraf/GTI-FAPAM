public class Biblioteca {
    private String nome;
    private Midia[] colecaoMidas;
    private int contador;

    public Biblioteca(String nome) {
        setnome(nome);
        colecaoMidas = new Midia[20];
        contador = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public void adicionarMidia(Midia midia) {
        if(contador < 10){
            colecaoMidas[contador++] = midia;
        }
    }

    public String listarMidia() {
        String retorno = "";
        for (int i = 0; i < contador; i++) {
            retorno += "Titulo: " + colecaoMidas[i].getTitulo() + ", Tipo de Midia: "+ colecaoMidas[i].tipoDeMidia();
            retorno += "\n";
        }
        return retorno;
    }

    public String exibirDetalhesMidia(String midia) {
        String retorno = "";
        for (int i = 0; i < contador; i++) {
            if (colecaoMidas[i].getCategoria().equals(midia)) {
                retorno = "Resultado da Busca Por: "+ midia + "";
                retorno += colecaoMidas[i].exibirinfo();
            }
        }


        return retorno;
    }

    public int contadorMidiasPorAno(int ano) {
        int retorno = 0;
        for (int i = 0; i < contador; i++) {
            if (colecaoMidas[i].getAnoLancamento() == ano) {
                retorno++;
            }
        }
        return retorno;
    }

}
