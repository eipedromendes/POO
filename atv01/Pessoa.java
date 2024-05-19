//Crie uma classe chamada "Pessoa" com os atributos "nome" e "idade".
//Crie um método chamado "imprimirDetalhes" que imprime o nome e a idade da pessoa.

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
    }
}


//public class Pessoa {
//    String nome;
//    int idade;
//
//    public void imprimirDetalhes(){
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade + " anos");
//    }
//    public Pessoa (String nome, int idade){
//        this.nome = nome;
//        this.idade = idade;
//    }
//
//    public static void main(String[] args){
//        Pessoa p1 = new Pessoa ("Pedro", 21);
//
//        p1.imprimirDetalhes();
//    }
//}