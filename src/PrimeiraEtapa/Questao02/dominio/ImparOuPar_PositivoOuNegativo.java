package PrimeiraEtapa.Questao02.dominio;

public class ImparOuPar_PositivoOuNegativo {
    public void imprimeParOuImparPosNeg(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Este número é par !!");
        } else {
            System.out.println("Este numero é impar!");
        }
        if (numero > 0){
            System.out.println("Este número é positivo!!");
        }else {
            System.out.println("Este número é negativo!!");
        }
    }
}
