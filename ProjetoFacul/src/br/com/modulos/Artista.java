package br.com.modulos;

import java.util.Date;

public class Artista extends Show {
    private String nomeDoArtista;
    private double cache;


    public Artista(Date data, Local local, double precoIngresso, String nomeDoArtista, double cache) {
        super(data, local, precoIngresso);
        this.nomeDoArtista = nomeDoArtista;
        this.cache = cache;

    }

    public void exibirDetalhes(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Artista convidado: " + nomeDoArtista + " Cachê: R$" + cache + "\n" + super.toString();
    }
}
