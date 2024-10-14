package br.com.java.screenmatch.calculo;

import br.com.java.screenmatch.modelos.Titulo;

public class CalculadorDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
