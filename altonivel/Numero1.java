package altonivel;

public class Numero1 {
    public static void main(String[] args) {
        // Cria um vetor para armazenar 25 inteiros
        int vetor[] = new int[25];

        // Popula o vetor
        for(int i = 0; i<25; i++) {
            vetor[i] = i;
        }

        // Cria as variáveis menor e maior a atribui o primeiro valor do vetor a elas
        int menor = vetor[0];
        int maior = vetor[0];

        // Percorre o vetor inteiro e determina o maior e menor número
        for(int i = 0; i<25; i++) {
            if(menor > vetor[i]) {
                menor = vetor[i];
            }
            if(maior < vetor[i]) {
                maior = vetor[i];
            }
        }

        // Gera a soma e o produto dos dois
        int soma = menor + maior;
        int produto = menor * maior;

        // Imprime os resultados
        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
        System.out.println("A soma é: " + soma);
        System.out.println("O produto é: " + produto);
    }
}