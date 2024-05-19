class TrabalhoVoluntario extends Projeto {

    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }
    public void setTipoTrabalho(String TipoTrabalho){
        this.tipoTrabalho = tipoTrabalho;
    }

    public boolean validaProjeto(String nomeProjeto){
        return true;
    }

    public String trabalhoVoluntario(String nomeProjeto, String descricao, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho){
        return trabalhoVoluntario();
    }
}