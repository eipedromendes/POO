abstract class Veiculo {

    private String modelo;
    private String marca;
    private int anoFabricacao;
    private boolean disponivel;

    public Veiculo(String modelo, String marca, int anoFabricacao, boolean disponivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.disponivel = disponivel;
    }

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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean Disponivel) {
        this.disponivel = disponivel;
    }

}
