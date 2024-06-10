public class Main {
    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == elemento) {
                return meio;
            } else if (array[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
        int elemento = 7;
        int posicao = buscaBinaria(array, elemento);

        if (posicao != -1) {
            System.out.println("O elemento " + elemento + " está na posição " + posicao);
        } else {
            System.out.println("O elemento " + elemento + " não foi encontrado no array.");
        }
    }
}
