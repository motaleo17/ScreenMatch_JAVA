package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.calculo.CalculadorDeTempo;
import br.com.java.screenmatch.calculo.FiltroRecomendacao;
import br.com.java.screenmatch.modelos.Episodio;
import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do Filme: " + meuFilme.getDuracaoEmMinutos());
        //Ricci Gente boa e gay
        //teste
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracao em minutos para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(lost);
        ep.setTotalVisualizacao(300);
        filtro.filtra(ep);

        var maisFilme = new Filme("Velozes e Furiosos",2007);
        maisFilme.setDuracaoEmMinutos(180);
        maisFilme.avalia(10);

        var listaFilmes = new ArrayList<Filme>();
        listaFilmes.add(maisFilme);
        listaFilmes.add(outroFilme);
        listaFilmes.add(meuFilme);
        System.out.println("A lista possui: " + listaFilmes.size() + " filmes");
        System.out.println("Primeiro Filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("Primeiro Filme: " + listaFilmes.get(0).toString());
    }
}