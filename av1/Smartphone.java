class Smartphone extends ProdutoEletronico {

    private String SistemaOperacional;

    public Smartphone(String modelo, String marca, double preco, boolean emPromocao, String SistemaOperacional) {
        super(modelo, marca, preco, emPromocao);
        this.SistemaOperacional = SistemaOperacional;
    }

}