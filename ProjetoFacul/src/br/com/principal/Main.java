package br.com.principal;

// Main.java
import br.com.modulos.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Local local1 = new Local("Arena Sombra", 5000, "Salvador");
        Local local2 = new Local("Praia Show", 3000, "Fortaleza");

        Date data1 = sdf.parse("10/06/2025");
        Date data2 = sdf.parse("15/06/2025");
        Date data3 = sdf.parse("20/06/2025");

        Show show1 = new Artista(data1, local1, 150.0, "ferrugem", 25000);
        Show show2 = new Artista(data2, local1, 200.0, "Matue", 100000);
        Show show3 = new Artista(data3, local2, 180.0,"Henry Freitas",15000);
        Show show4 = new Show(data1,local1,150);
        Show show5 = new Show(data2,local2,150);

        for (int i = 1; i <= 500; i++) {
            show1.venderingresso(new Ingressos("S1-" + i, "Pista", 150.0));
            show1.venderingresso(new Ingressos("S2-" + i, "VIP", 200.0));
            show1.venderingresso(new Ingressos("S3-" + i, "Camarote", 180.0));
        }

        for (int i=0; i <=1500 ; i++){
            show2.venderingresso(new Ingressos("S1-" + i, "Pista", 200.0));
            show2.venderingresso(new Ingressos("S2-" + i, "VIP", 350.0));
            show2.venderingresso(new Ingressos("S3-" + i, "Camarote", 700.0));
        }

        for (int i=1; i <=1000; i++){
            show3.venderingresso(new Ingressos("S1-" + i, "Pista", 180.0));
            show3.venderingresso(new Ingressos("S2-" + i, "VIP", 250.0));
            show3.venderingresso(new Ingressos("S3-" + i, "Camarote", 350.0));
        }

        GerenciamentoDeEvento gerenciamento = new GerenciamentoDeEvento();
        gerenciamento.adicaoDeShow(show1);
        gerenciamento.adicaoDeShow(show2);
        gerenciamento.adicaoDeShow(show3);
        gerenciamento.adicaoDeShow(show4);
        gerenciamento.adicaoDeShow(show5);

        System.out.println("=== LOCAIS ===");
        local1.exibirinformacoes();
        local2.exibirinformacoes();

        System.out.println("\n=== SHOWS ===");
        gerenciamento.listaDeShow();

        System.out.println("\n=== BUSCAR SHOW POR DATA ===");
        Date busca = sdf.parse("15/06/2025");
        Show encontrado = gerenciamento.BuscarPorData(busca);

        if (encontrado != null) {
            System.out.println("Show encontrado:");
            encontrado.exibirdetalhes();
        } else {
            System.out.println("Nenhum show encontrado para esta data.");
        }
    }
}

