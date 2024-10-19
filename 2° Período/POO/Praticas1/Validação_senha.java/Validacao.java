public class Validacao {
    private String nome;
    private int idade;
    private String senha;
    private boolean validacao;

    // Metado contrutor
    public Validacao(String nome, int idade, String senha) {
        setNome(nome);
        setIdade(idade);
        setSenha(senha);
        this.validacao = false;
    }

    // Metados Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getValidacao() {
        return validacao;
    }

    private void setValidacao() {
        this.validacao = true;
    }

    // Metado de validação
    // O método matches() em Java é usado para verificar se uma String corresponde a uma determinada expressão
    public void validacao() {
        if (getSenha().length() >= 8) {     // texto.length() retorna o comprimento (número de caracteres) e verifica se o tamanho é menor que 8
                                        
            if (getSenha().matches(".*[0-9].*")) {      // [0-9] representa qualquer int entra a String
                if (getSenha().matches(".*[A-Z].*")) {          // [A-Z] representa qualquer letra maiúscula de A a Z
                    if (getSenha().matches(".*[^a-zA-Z0-9].*")) {       // [^a-zA-Z0-9] significa "qualquer caractere que não seja uma letra (a-z ou A-Z) ou um número (0-9)".                                               /
                        setValidacao();
                        System.out.println("Senha validada");
                    }

                    else {
                        System.out.println("Senha sem caracter especial");
                    }
                }

                else {
                    System.out.println("Senha sem nenhuma letra maiuscula");
                }

            }

            else {
                System.out.println("Senha sem nenhum numero ");
            }

        }

        else {
            System.out.println("Senha com menos de 8 caracteres");
        }
    }

    // Metado que mostra o status
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Senha: " + getSenha());
        System.out.println("VAlidação: " + getValidacao());
    }

}
