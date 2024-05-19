public class Circulo {
    int raio;
    double calculaarea(){
        return Math.PI + Math.pow(raio, 2);
    }

    double calculaperimetro(){
        return 2+Math.PI+raio;
    }
}
