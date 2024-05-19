public class ProjetoSocial {

    public static void main(String[] args){
        Projeto p1 = new Projeto("Alimento para todos", "levar comida para todos", "Belo Horizonte", "21/04/24", "21/04/30");
        System.out.println("Projeto:" + p1.getNomeProjeto(), "descrição:" + p1.getDescricao(), "endereço" + p1.getEndereco());
    }
}