package br.com.java.screenmatch.principal;

import br.com.java.screenmatch.modelos.Filme;
import br.com.java.screenmatch.modelos.Serie;
import br.com.java.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(7);

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(8);

        Filme filmeDoRicci = new Filme("Ricci e Rissou",2024);

        var maisFilme = new Filme("Velozes e Furiosos",2007);
        maisFilme.avalia(10);

        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisFilme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao: " + filme.getClassificacao());
            }

        }

    }
}
