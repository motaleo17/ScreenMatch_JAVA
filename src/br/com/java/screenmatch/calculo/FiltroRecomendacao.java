package br.com.java.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Os melhores dos melhores avaliados");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("Mais ou menos avaliado");
        }else {
            System.out.println("Melhor deixar para depois");
        }
    }
}
