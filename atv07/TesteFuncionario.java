public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Erick", 21, 3000.00);
        Funcionario f2 = new Funcionario("Glauber", 20, 3500.00);
        Gerente g1 = new Gerente("Pedro", 21, 10000.00, "Tático");

        f1.setNome("Erick Louback");
        f1.setIdade(21);
        f1.setSalario(4000.00);

        f2.setNome("Glauber Maia");
        f2.setIdade(20);
        f2.setSalario(5000.00);

        g1.setNome("Pedro Mendes");
        g1.setIdade(21);
        g1.setSalario(30000.00);
        g1.setDepartamento("RH");

        System.out.println("Nome do Funcionário 1: " + f1.getNome());
        System.out.println("Idade do Funcionário 1: " + f1.getIdade());
        System.out.println("Salário do Funcionário 1: " + f1.getSalario());

        System.out.println("\n");

        System.out.println("Nome do Funcionário 2: " + f2.getNome());
        System.out.println("Idade do Funcionário 2: " + f2.getIdade());
        System.out.println("Salário do Funcionário 3: " + f2.getSalario());

        System.out.println("\n");

        System.out.println("Nome do Gerente: " + g1.getNome());
        System.out.println("Idade do Gerente: " + g1.getIdade());
        System.out.println("Salário do Gerente: " + g1.getSalario());
        System.out.println("Departamento do Gerente: " + g1.getDepartamento());

        System.out.println("\n");

    }
}