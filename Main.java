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
                        // Utilizando o metodo exibirStatus()
                        System.out.println(p.exibirStatus());

                        System.out.println("\n --- Usando habilidade ---");
                        p.usarHabilidade();

                        System.out.print(
                                        "---------------------------------------------------------------------------------------------------\n");

                }

                // Verificando qual a instancia de cada personagem
                System.out.print(
                                "\n-------- Apresentando as habilidades utilizadas incluidas na lista de ações (Apenas para os magos) ---------\n");
                for (Personagem p1 : herois) {
                        if (p1 instanceof Mago) {
                                Mago m1 = (Mago) p1;
                                m1.registrarAcao("O Mago" + m1.getNome() + " usou a habilidade " + m1.habilidade);
                                m1.auditarAcoes();
                        }

                }

                System.out.print("\n");

                for (Personagem p3 : herois) {
                        if (p3 instanceof Mago) {
                                Mago m1 = (Mago) p3;
                                m1.atribuirBencao(20);
                        } else if (p3 instanceof Guerreiro) {
                                Guerreiro g1 = (Guerreiro) p3;
                                g1.atribuirBencao(30);
                        }

                }

                // Exibindo status dos personagens novamente
                System.out.print("\n ---- Exibindo status dos personagens após atribuir benção ----");
                for (Personagem p3 : herois) {
                        System.out.println(p3);
                }

        }
}
