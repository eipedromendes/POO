class Mamifero extends Animal{

    private int quantidadeMamas;

    public Mamifero(String nome, int idade, String somEmitido, int quantidadeMamas){
        super (nome, idade, somEmitido);
        this.quantidadeMamas = quantidadeMamas;
    }

    void emitirSom(){
        System.out.println("Miau");
    }
}
