public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_port;
    double nota_geo;
    double nota_fis;
    double nota_quim;
    Disciplina disciplina_preferida;

    public Aluno(String nome, int matricula, double nota_mat, double nota_port, double nota_geo, double nota_fis, double nota_quim, Disciplina disciplina_preferida){
    this.nome =nome;
    this.matricula = matricula;
    this.nota_mat = nota_mat;
    this.nota_port = nota_port;
    this.nota_geo = nota_geo;
    this.nota_fis = nota_fis;
    this.nota_quim = nota_quim;
    this.disciplina_preferida = disciplina_preferida;
}
    double CalcularMedia() {
        return (nota_fis+nota_geo+nota_mat+nota_port+nota_quim)/5;
    }
    String SituacaoAluno() {
        String situacao = "Reprovado"; //Aprovado ou Reprovado

        if (CalcularMedia() >= 6)
            situacao = "Aprovado";

        return situacao;
    }

}
