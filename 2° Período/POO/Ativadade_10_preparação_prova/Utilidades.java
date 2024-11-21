// Crinado classe Utilidade
public class Utilidade {
    // Criando metado que retorna o Titulo de cada Midia dentro do array
    public static String exibirPorCategoria(Midia[] midias, String categoria) {
        String retorno = "";
        for (int i = 0; i < midias.length; i++) {
            if (midias[i] != null) {
                midias[i].getTitulo();
            }

        }
        return retorno;
    }

}
