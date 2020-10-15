package altonivel;

public class Numero2 {
    public static void main(String[] args) {
        // Cria a string para teste
        String texto = "Isso é uma string abacaxi melancia";

        // Cria um contador de palavras
        int palavras = 1;

        // Conta as palavras através dos espaços encontrados na frase
        for(int i = 0; i<texto.length(); i++) {
            if(texto.charAt(i) == ' ') {
                palavras++;
            }
        }

        // Imprime o resultado da contagem
        System.out.println("O número de palavras na frase é: " + palavras);
    }
}
