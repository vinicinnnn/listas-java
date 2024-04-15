//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb;
        System.out.println("Digite um numero de 0 a 10");
        numb = scanner.nextInt();
        System.out.println("tabuada de " + numb + ":");
        for(int i = 0; i <= 10; i++){
            System.out.println(numb + " x " + i + "=" + (numb * i));
        }

        scanner.close();



    }
}