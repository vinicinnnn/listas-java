public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int determinante = calcularDeterminante(matriz);

        System.out.println("A determinante da matriz é: " + determinante);
    }

    public static int calcularDeterminante(int[][] matriz) {
        int determinante = 0;
        determinante += matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1]);
        determinante -= matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0]);
        determinante += matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        return determinante;
    }
}