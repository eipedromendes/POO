class Laptop extends ProdutoEletronico {

    private int MemoriaRam;

    public Laptop(String modelo, String marca, double preco, boolean emPromocao, int MemoriaRam) {
        super(modelo, marca, preco, emPromocao);
        this.MemoriaRam = MemoriaRam;
    }

}