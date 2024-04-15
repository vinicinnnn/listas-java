import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] numeros = new int [10];
        Scanner in = new Scanner(System.in);

        for ( int i = 0; i< numeros.length; i++) {
            System.out.println("Digite o valor " + (i + 1)+":"); //() para somar
            numeros[i] = in.nextInt();
        }
        for (int numero : numeros){  // --> FOR IT <--
            System.out.println(numero);
        }

        System.out.println("Ordem inversa: "); //Ordem decrescente
        for (int i = numeros.length-1; i >= 0; i--)
            System.out.println(numeros[i]);

    }
}