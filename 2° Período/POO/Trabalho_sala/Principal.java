public class Principal {
    public static void main(String[] args) {
        // Criando uma escola e colando o nome nela
        Escola Fapam = new Escola();
        Fapam.setNome("Fapam");

        // Criando nosso Professor
        Professor Daniel = new Professor("Daniel", 38, "Masculino", 4000);

        // Criando nossa Materia
        Materia Poo = new Materia(Daniel, "POO");

        // Craindo nosso Diretor
        Diretor Reinaldo = new Diretor("Reinaldo", 56, "Masculino", 8000, Poo, 8);

        // Criando um Aluno e um Bolsista
        Pessoa Guilherme = new Aluno("Guilherme", 20, "Masculino", "16220", Fapam);
        Pessoa Mateus = new Bolsista("Mateus", 22, "Neutro", "11111", Fapam);

        // Adicionando Aluno e Bolsista ao array de Alunos da Materia POO
        Poo.adicionarAluno(Guilherme);
        Poo.adicionarAluno(Mateus);

        // Vericando se é um Diretor valido e o Salario do professor
        System.out.println(Utilidades.validarDiretor(Reinaldo));
        System.out.println(Utilidades.validarSalarioProfessor(Daniel));

    }
}
