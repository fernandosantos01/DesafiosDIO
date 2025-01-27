package PrimeiraEtapa.Questao11.dominio;

public class Aluno extends Pessoa {
    private static final int TAM_ARRAY = 3;
    private double[] notas = new double[TAM_ARRAY];
    private double media;

    public Aluno(String nome, int idade, double[] notas) {
        super(nome, idade);
        this.notas = notas;
    }

//    public Aluno(String nome, int idade,double[] notas) {
//        this(nome, idade);
//        this.notas = notas;
//    }

    @Override
    public double calculaMedia() {
        System.out.println("Calculando Média!!");
        for (int i = 0; i < TAM_ARRAY; i++) {
            this.media += this.notas[i];
        }
        media =  media/TAM_ARRAY;
        if (media >= 7){
            System.out.println("Aprovado(a)!");
        }else {
            System.out.println("Reprovado(a)!!");
        }
        return media ;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
