import java.util.Scanner;

public class Main {
    public static boolean verificarPalindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int i = 0;
        int j = palavra.length() - 1;

        while (i < j) {
            if (palavra.charAt(i) != palavra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase para verificar se é um palíndromo: ");
        String entrada = scanner.nextLine();

        if (verificarPalindromo(entrada)) {
            System.out.println("\"" + entrada + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + entrada + "\" não é um palíndromo.");
        }

        scanner.close();
    }
}
