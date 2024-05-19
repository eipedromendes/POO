class TV extends ProdutoEletronico {

    private double TamanhoTela;

    public TV(String modelo, String marca, double preco, boolean emPromocao, double TamanhoTela) {
        super(modelo, marca, preco, emPromocao);
        this.TamanhoTela = TamanhoTela;
    }

}