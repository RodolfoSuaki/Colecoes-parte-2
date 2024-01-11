import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte1 {
    static List<String> listaUsuarios = new ArrayList<String>();
    static void leituraDeUsuarios() {
        Scanner leitura1 = new Scanner(System.in);
        System.out.println("Você deseja cadastrar nome de usuário? S/N");
        String resposta1 = leitura1.next();

        
        while (resposta1.equalsIgnoreCase("s")) {
            Scanner leitura2 = new Scanner(System.in);
            System.out.println("\nPor gentileza, digitar outro nome de usuário: ");
            String resposta2 = leitura2.next();
            listaUsuarios.add(resposta2);

            System.out.println("\nVocê deseja cadastrar outro nome de usuário? S/N");
            resposta1 = leitura1.next();
        }
        Collections.sort(listaUsuarios);
        System.out.println("\nO ArrayList dos usuários cadastros em ordem alfabética é: "+listaUsuarios);
    }
}
