public class TestaConta{
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria();

        c1.numero = 777;
        c1.titular = "Pedro Mendes";
        c1.saldo = 500;

        c1.exibir();
        c1.depositar(1000);
        c1.exibir();
        c1.sacar(700);
        c1.exibir();
    }
}