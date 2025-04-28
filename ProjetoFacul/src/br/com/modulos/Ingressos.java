package br.com.modulos;

public class Ingressos {
    private String codigo;
    private String tipo;
    private double preco;

    public Ingressos(String codigo, String tipo, double preco){
        this.codigo = codigo;
        this.tipo = tipo;
        this.preco = preco;
    }

    public void exibirdetalhes(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Ingresso [" + tipo + "] - Código: " + codigo + " | Preço: R$" + preco;
    }

    public double getPreco() {
        return preco;
    }
}
