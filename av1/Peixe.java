class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(String nome, int idade, String somEmitido, String tipoHabitat){
        super (nome, idade, somEmitido);
        this.tipoHabitat = tipoHabitat;
    }

    void emitirSom(){
        System.out.println("Glood");
    }
}
