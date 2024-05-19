//Crie uma classe chamada "Produto" que represente um produto em uma loja.
//O produto deve ter os seguintes atributos: "nome" (String), preço (double) e quantidade em estoque (int).
//Implemente métodos para aumentar a quantidade em estoque, diminuir, e calcular o valor total do estoque.


public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void aumentarEstoque(int quant){
        this.quantidade += quant;
    }

    public void diminuirEstoque(int quant){
        this.quantidade -= quant;
    }

    public double valorEstoque(){
        return this.quantidade * this.preco;
    }
}


//public class Produto {
//    String nome;
//    public double preco;
//    int quantEstoque;
//
//    public Produto(String nome, double preco, int quantEstoque){
//        this.nome = nome;
//        this.preco = preco;
//        this.quantEstoque = quantEstoque;
//    }
//
//    public void diminuirEstoque(int quantidade){
//        if (quantEstoque >= quantidade){
//            quantEstoque -= quantidade;
//        }
//
//        else {
//            System.out.println("Quantidade insuficiente em estoque.");
//        }
//    }
//
//    public double calcularValorEstoque(){
//        return preco * quantEstoque;
//    }
//
//    public static void main(String[] args){
//        Produto p1 = new Produto("Boné", 20.0, 10);
//
//        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());
//
//        p1.aumentarEstoque(10);
//
//        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());
//
//        p1.diminuirEstoque(5);
//
//        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());
//    }
//}