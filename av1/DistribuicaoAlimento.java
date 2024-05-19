class DistribuicaoAlimento extends Projeto {

    private String descAlimento;
    private double qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, double qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }
    public void setDescAlimento(String descAlimento){
        this.descAlimento = descAlimento;
    }

    public double getQtde() {
        return qtde;
    }
    public void setQtde(double qtde){
        this.qtde = qtde;
    }

    public boolean validaProjeto(String nomeProjeto){
        return true;
    }

    public String imprimeProjeto(String nomeProjeto, String descricao, String dataInicio, String dataFim, String descAlimento, double qtde){
        return imprimeProjeto();
    }
}