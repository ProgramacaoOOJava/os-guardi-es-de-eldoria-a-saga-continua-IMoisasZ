package desafio;

import java.util.ArrayList;
import java.util.List;

// Classe mago
public class Mago extends Personagem implements Auditavel {
    // Atributo especifico da classe
    String habilidade;
    List<String> acoes = new ArrayList<>();

    // Metodo construtor da classe
    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase, String habilidade) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.habilidade = habilidade;
    }

    // Sobrescrevendo o metodo da classe pai
    @Override
    public void usarHabilidade() {
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void registrarAcao(String acao) {
        if (acao == null || acao == "") {
            System.out.println("Ação não informada!");
            return;
        }
        acoes.add(acao);
    }

    @Override
    public void auditarAcoes() {
        if (acoes.size() == 0) {
            System.out.println("Não há acões para apresentar!");
            return;
        }
        for (String acao : acoes) {
            System.out.println(acao);
        }
    }

}