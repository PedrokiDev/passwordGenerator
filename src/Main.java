import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o tamanho da senha que você deseja?");
        int tamanhoSenha = input.nextInt();

        String senha = gerarSenha(tamanhoSenha);
        System.out.println("Senha gerada: " + senha);

        input.close();
    }

    public static String gerarSenha(int tamanho){
        String todosCaracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[]{}|;:,.<>?";
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++){
            int indice = random.nextInt(todosCaracteres.length());
            senha.append(todosCaracteres.charAt(indice));
        }

        return senha.toString();
    }
}