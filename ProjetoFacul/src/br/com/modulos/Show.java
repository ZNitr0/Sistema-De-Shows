package br.com.modulos;

import java.util.ArrayList;
import java.util.Date;

public class Show {
    protected Date data;
    protected Local local;
    protected ArrayList<Ingressos> ingressos = new ArrayList<>();
    protected double precoIngresso;

    public Show(Date data, Local local, double precoIngresso){
        this.data = data;
        this.local = local;
        this.precoIngresso = precoIngresso;
    }

    public boolean venderingresso( Ingressos ingresso){
        if(Verificardisponiblidade()){
            ingressos.add(ingresso);
            return true;
        }
        return false;
    }
    public boolean Verificardisponiblidade(){
        return ingressos.size() < local.getCapacidadeMaxima();
    }
    public void exibirdetalhes(){
        System.out.println(this);
    }
    public double CalculoDeFatutamento(){
        return ingressos.stream().mapToDouble(Ingressos::getPreco).sum();
    }

    public Date getData(){
        return data;
    }

    @Override
    public String toString() {
        return " Local do Show: " + local + " Na data: " + data + " Número de Ingressos Vendidos: " + ingressos.size();
    }
}
