public class testaProduto {
    public static void main(String[] args){
        Produto p1 = new Produto("Arroz", 30.0, 200);

        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());

        p1.aumentarEstoque(100);

        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());

        p1.diminuirEstoque(50);

        System.out.println("Estoque de" + p1.nome + ": " + p1.valorEstoque());
    }
}