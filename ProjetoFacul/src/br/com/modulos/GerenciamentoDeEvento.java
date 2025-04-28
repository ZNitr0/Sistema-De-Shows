package br.com.modulos;

import java.util.ArrayList;
import java.util.Date;

public class GerenciamentoDeEvento {
    private ArrayList<Show> shows = new ArrayList<>();

    public void adicaoDeShow(Show show){
        shows.add(show);
    }

    public void listaDeShow(){
        for (Show w : shows){
             w.exibirdetalhes();
            System.out.println("------------------------");
        }
    }

    public Show BuscarPorData(Date data){
        for (Show w : shows){
            if (w.getData().equals(data)){
                return w;
            }
        }
        return null;
    }
}
