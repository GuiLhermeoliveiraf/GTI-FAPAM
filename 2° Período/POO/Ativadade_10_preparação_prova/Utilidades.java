public class Utilidade {
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
