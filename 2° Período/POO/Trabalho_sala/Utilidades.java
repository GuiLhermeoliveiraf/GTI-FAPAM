public class Utilidades {
    // Metados que valida tempo de cargo do Diretor
    public static String validarDiretor(Diretor diretor) {
        if (diretor.getAnoCargo() > 5) {
            return "Esse diretor é um diretor Valido";
        } else {
            return "Diretor com experiencia menor que 5 anos";
        }
    }

    // Metado que valida o salario do Professor
    public static String validarSalarioProfessor(Professor professor) {
        float pisoSalario = 3200f;
        if (professor.getSalario() >= pisoSalario) {
            return "Professor recebe salario acima do piso";
        } else {
            return "Professor recebe abaixo do pisso, deve receber um aumento de: "
                    + (pisoSalario - professor.getSalario());
        }
    }
}
