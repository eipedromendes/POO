class Ave extends Animal{

    private double envergaduraAsas;

    public Ave(String nome, int idade, String somEmitido, double envergaduraAsas){
        super (nome, idade, somEmitido);
        this.envergaduraAsas = envergaduraAsas;
    }

    void emitirSom(){
        System.out.println("Piu piu");
    }
}