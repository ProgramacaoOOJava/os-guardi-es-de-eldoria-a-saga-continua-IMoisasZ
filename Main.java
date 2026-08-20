package Tema2.novato.desafio;

// Imports para utilização de List e ArrayList
import java.util.ArrayList;
import java.util.List;

// Classe main
public class Main {
    // Metodo main (principal)
    public static void main(String[] args) {
        // Informações...
        System.out.println("\n=== BEM VINDOS AO REINO DE ELDORIA ===");
        System.out.println("Os Guardiões se preparam para a batalha\n");

        // Criando os personagens/herois
        List<Personagem> herois = new ArrayList<>();
        herois.add(new Guerreiro("Thor", "Guerreiro", 10, 10, 254.85,
                "Usa seu matelo Myonir para lançar raios poderosos!"));
        herois.add(new Mago("Magaiver", "Mago", 4, 6, 80.25,
                "Utiliza de qualquer tipo de coisa para criar algo para lhe tirar de enrascadas!"));
        herois.add(new Guerreiro("Kratos", "Guerreiro", 10, 10, 1454.74,
                "Pode utilizar varias armas e ainda tem o poder da caixa de pandora que o deixa com a capacidade de matar deuses!"));
        herois.add(new Mago("Harry", "Mago", 9, 7, 118.15,
                "Pode usar sua varinha para lançar poderes magicos e conjurar feitiços poderosos!"));

        // Mostrando os herois cadastrados
        System.out.print("\n=== CADASTRO DOS HEROIS ===");
        for (Personagem p : herois) {
            p.exibirStatus();

            p.usarHabilidade();
            System.out.println();
        }
    }
}
