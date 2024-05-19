public class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    void depositar (double valor){
        if (valor > 0){
            saldo += valor;
            System.out.print("\nDepósito efetuado: " + valor);
        }
    }

    void sacar (double valor){
        if (valor > 0){
            saldo -= valor;
            System.out.print("\nSaque efetuado: " + valor);
        }
    }
    void exibir(){
        System.out.print("\nO saldo da conta é: " + saldo);
    }
}