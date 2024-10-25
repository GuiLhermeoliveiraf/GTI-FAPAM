public class Principal{
    public static void main(String [] args){
        Funcionario fun1 = new Funcionario("Guilherme", 1500f);
        Gerente ger1 = new Gerente("Gabriel", 1600f, 300f);
        Programador pro1 = new Programador("Lucas", 2000f, "java");

        System.out.println(fun1.exibirDados());
        System.out.println(ger1.exibirDados());
        System.out.println(pro1.exibirDados());
        
        

    }
}
