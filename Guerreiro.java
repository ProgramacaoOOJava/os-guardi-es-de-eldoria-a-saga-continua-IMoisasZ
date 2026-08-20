package Tema2.novato.desafio;

// Classe guerreiro
public class Guerreiro extends Personagem {
    // Atributo especifico da classe
    String habilidade;

    // Metodo construtor da classe
    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase, String habilidade) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
        this.habilidade = habilidade;
    }

    // Sobrescrevendo o metodo da classe pai
    @Override
    public void usarHabilidade() {
        System.out.println(exibirStatus() + "\nHabilidade: " + habilidade);
    }
}