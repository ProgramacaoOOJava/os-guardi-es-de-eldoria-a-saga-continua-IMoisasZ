package desafio;

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
                                "Usa seu martelo Myonir para lançar raios poderosos!"));
                herois.add(new Mago("Magaiver", "Mago", 4, 6, 80.25,
                                "Utiliza de qualquer tipo de coisa para criar algo para lhe tirar de enrascadas!"));
                herois.add(new Guerreiro("Kratos", "Guerreiro", 10, 10, 1454.74,
                                "Pode utilizar varias armas e ainda tem o poder da caixa de pandora que o deixa com a capacidade de matar deuses!"));
                herois.add(new Mago("Harry", "Mago", 9, 7, 118.15,
                                "Pode usar sua varinha para lançar poderes magicos e conjurar feitiços poderosos!"));

                // Mostrando os herois cadastrados
                System.out.print("\n=== CADASTRO DOS HEROIS ===");
                for (Personagem p : herois) {
                        // Utilizando o metodo toString()
                        System.out.println(p.toString());

                        p.usarHabilidade();

                        // Verificando qual a instancia de cada personagem
                        System.out.print(
                                        "\n-------------------------- Verificando qual é a classe implementada -------------------------------\n");
                        if (p instanceof Guerreiro) {
                                Guerreiro g = (Guerreiro) p;
                                System.out.println("O personagem " + g.getNome() + " é um Guerreiro");
                        } else if (p instanceof Mago) {
                                Mago m = (Mago) p;
                                System.out.println("O personagem " + m.getNome() + " é um Mago");
                        }
                        System.out.print(
                                        "---------------------------------------------------------------------------------------------------\n");

                }

                System.out.print("\n");

                System.out.print(
                                "\n ---------------------------------- Comparando com equals() ---------------------------------------\n");
                // Comparando 2 Personagens
                Personagem p1 = herois.get(0);
                Personagem p2 = herois.get(1);
                Personagem p3 = herois.get(2);
                Personagem p4 = herois.get(3);

                System.out.println("Os personagens " + p1.getNome() + " e " + p2.getNome() + " são " + p1.equals(p2));
                System.out.println("Os personagens " + p1.getNome() + " e " + p1.getNome() + " são " + p1.equals(p1));
                System.out.println("Os personagens " + p3.getNome() + " e " + p2.getNome() + " são " + p3.equals(p2));
                System.out.println("Os personagens " + p4.getNome() + " e " + p4.getNome() + " são " + p4.equals(p4));

                System.out.print(
                                "\n ---------------------------------- hashCode dos objetos ------------------------------------------\n");

                System.out.println("hashCode do personagem " + p1.getNome() + " com a classe " + p1.getClasse() + " é: "
                                + p1.hashCode());
                System.out.println("hashCode do personagem " + p2.getNome() + " com a classe " + p2.getClasse() + " é: "
                                + p2.hashCode());
                System.out.println("hashCode do personagem " + p3.getNome() + " com a classe " + p3.getClasse() + " é: "
                                + p3.hashCode());
                System.out.println("hashCode do personagem " + p4.getNome() + " com a classe " + p4.getClasse() + " é: "
                                + p4.hashCode());
        }
}
