package Tema2.novato.desafio;

// Classe personagem
public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // metodo abstrato com ashabilidades especificas de cada personagem que deve ser
    // implementada de acordo
    public abstract void usarHabilidade();

    public String exibirStatus() {
        return "\nNome: " + nome + "\nClasse: " + classe + "\nNivel: " + nivel + "\nPontos de vida: "
                + pontosDeVida + "\nPoder base: " + poderBase;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }

    // setters
    public String setNome(String nome) {
        this.nome = nome;
        return this.nome;
    }

    public String setClasse(String classe) {
        this.classe = classe;
        return this.classe;
    }

    public int setNivel(int nivel) {
        this.nivel = nivel;
        return this.nivel;
    }

    public int setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
        return this.pontosDeVida;
    }

    public double setPoderBase(double poderBase) {
        this.poderBase = poderBase;
        return this.poderBase;
    }

}
