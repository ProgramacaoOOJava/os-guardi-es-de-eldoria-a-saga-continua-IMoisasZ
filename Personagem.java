package desafio;

import java.util.Objects;

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

    // metodo abstrato que deve ser sobrescrito pelas subclasses especificas.
    public abstract void usarHabilidade();

    // Metodo para exibir as informações dos personagens
    public String exibirStatus() {
        return "\n Nome: " + nome + "\nClasse: " + classe + "\nNivel: "
                + nivel + "\nPontos de vida: " + pontosDeVida + "\nPoder base: " + poderBase;
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
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
            return this.nome;
        }
        return nome;
    }

    public String setClasse(String classe) {
        if (classe != null && !classe.trim().isEmpty()) {
            this.classe = classe;
            return this.classe;
        }
        return classe;
    }

    public int setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 10) {
            this.nivel = nivel;
            return this.nivel;
        }
        return nivel;
    }

    public int setPontosDeVida(int pontosDeVida) {
        if (pontosDeVida >= 1 && pontosDeVida <= 10) {
            this.pontosDeVida = pontosDeVida;
            return this.pontosDeVida;
        }
        return pontosDeVida;
    }

    public double setPoderBase(double poderBase) {
        if (pontosDeVida >= 1 && pontosDeVida <= 100.00) {
            this.poderBase = poderBase;
            return this.poderBase;
        }
        return pontosDeVida;
    }

    // Sobrescrevendo o metodo toString()
    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nClasse: " + classe +
                "\nNivel: " + nivel +
                "\nPontos de vida: " + pontosDeVida +
                "\nPoder base: " + poderBase;
    }

    // Sobrecrevendo o metodo equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Personagem personagem = (Personagem) obj;
        return nome.equals(personagem.nome) && classe.equals(personagem.classe);
    }

    // Sobrescrevendo o metodo hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(nome, classe);
    }

    // Metodo atribuir benção
    protected void atribuirBencao(double valor) {
        if (valor > 0) {
            this.poderBase += valor;
        }
    }

}
