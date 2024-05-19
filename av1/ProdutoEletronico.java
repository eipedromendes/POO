//a)Implemente uma classe ProdutoEletronico
public class ProdutoEletronico implements Promocao {

    //com os atributos modelo, marca e preco
    private String modelo;
    private String marca;
    private double preco;
    private boolean emPromocao;

    public ProdutoEletronico(String modelo, String marca, double preco, boolean emPromocao) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
        this.emPromocao = emPromocao;
    }

    //Implemente também os métodos getters e setters para cada atributo.
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double CalcularDesconto() {
        if (emPromocao) {
            System.out.println("Produto em Promoção");
        } else {
            System.out.println("Produto não está em promoção");
        }
    }
}

//b)Crie três subclasses de ProdutoEletronico: Smartphone, Laptop e TV. Cada uma dessas subclasses deve ter um
//atributo adicional para armazenar informações específicas, como tamanho da tela para TV, memória RAM para Laptop e
//sistema operacional para Smartphone.
