import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        leituraDePessoas();
    }

    private static void leituraDePessoas() {
        Scanner r = new Scanner(System.in);
        System.out.println("Você deseja registrar um novo usuário: s/n?");
        String resposta = r.next();
        List<String> listaHomens = new ArrayList<>();
        List<String> listaMulheres = new ArrayList<>();
        List<String> listaOutros = new ArrayList<>();

        while (resposta.equalsIgnoreCase("s")) {
            // Registro do nome do usuário
            Scanner n = new Scanner(System.in);
            System.out.println("\nQual o nome do usuário?");
            String nome = n.next();

            // Registro do gênero do usuário
            Scanner g = new Scanner(System.in);
            System.out.println("\nQual o gênero desse usuário? M/F/Outro");
            String genero = g.next();

            // Alocação do usuário conforme gênero
            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("Outro")) {
                if (genero.equalsIgnoreCase("M")) {
                    String homem = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaHomens.add(homem);
                } else if (genero.equalsIgnoreCase("F")) {
                    String mulher = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaMulheres.add(mulher);
                } else if (genero.equalsIgnoreCase("Outro")) {
                    String outro = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaOutros.add(outro);
                }
            } else {
                while (!genero.equalsIgnoreCase("M") && !genero.equalsIgnoreCase("F") && !genero.equalsIgnoreCase("Outro")) {
                    System.out.println("\nPor favor, digite um gênero aceito pelo sistema!");
                    System.out.println("\nQual o gênero desse usuário? M/F/Outro");
                    genero = g.next();
                }

                if (genero.equalsIgnoreCase("M")) {
                    String homem = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaHomens.add(homem);
                } else if (genero.equalsIgnoreCase("F")) {
                    String mulher = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaMulheres.add(mulher);
                } else if (genero.equalsIgnoreCase("Outro")) {
                    String outro = nome + " - " + genero.toUpperCase(Locale.ROOT);
                    listaOutros.add(outro);
                }
            }

            System.out.println("\nVocê deseja registrar novamente um novo usuário: s/n?");
            resposta = r.next();
        }

        System.out.println("O grupo de usuários homens é: " + listaHomens);
        System.out.println("O grupo de usuários mulheres é: " + listaMulheres);
        System.out.println("O grupo de usuários que possui outro gênero é: " + listaOutros);
    }
}
