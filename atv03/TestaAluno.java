public class TestaAluno {
    public static void main(String[] args) {
        Disciplina d1 = new Disciplina("Matemática", 60);
        Aluno a1 = new Aluno("Pedro", 7, 10, 9, 8, 9, 10, d1);

        System.out.print("Situação do aluno:" + a1.nome + "=" + a1.SituacaoAluno());
        System.out.print("\nDisciplina preferida: " + a1.disciplina_preferida.nome);
    }
}
