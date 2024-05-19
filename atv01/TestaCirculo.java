public class TestaCirculo{
    public static void main(String[] args){
        Circulo c1 = new Circulo();

        c1.raio = 3;
        System.out.print("\nÁrea do circulo: " + c1.calculaarea());
        System.out.print("\nPerímetro do circulo: " + c1.calculaperimetro());
    }
}