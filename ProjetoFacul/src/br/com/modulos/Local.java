package br.com.modulos;

public class Local {
    private String Nome;
    private int  CapacidadeMaxima;
    private String Cidade;

    public Local(String Nome,int CapacidadeMaxima, String Cidade){
        this.Nome = Nome;
        this.CapacidadeMaxima = CapacidadeMaxima;
        this.Cidade = Cidade;
    }

    public void exibirinformacoes(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return Nome + " | Capacidade: " + CapacidadeMaxima + " | Cidade: " + Cidade;
    }

    public int getCapacidadeMaxima(){
        return CapacidadeMaxima;
    }
}
