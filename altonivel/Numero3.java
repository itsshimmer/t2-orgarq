package altonivel;

public class Numero3 {
    public static void main(String[] args) {

        // Cria as strings frase e palavra
        String frase = "abacaxi melancia laranja maçã abacaxi";
        String palavra = "abacaxi";

        // Cria o contador de ocorrencias da palavra
        int ocorrencias = 0;

        // Laço de repetição para o tamanho da frase
        for(int x = 0; x<frase.length(); x++) {
            // Booleano para verificar validade
            boolean valid = true;
            // Valor inicial do X antes do verificação da palavra
            int preX = x;
            // Laço de repetição para o tamanho da palavra
            for(int y = 0; y<palavra.length(); y++) {
                // Verifica se o caractere no index X da frase é diferente do index Y da palavra
                if(frase.charAt(x)!=palavra.charAt(y)) {
                    // Invalida a verificação caso encontre caractere diferente
                    valid = false;
                }
                // Caso não esteja no limite da frase, aumenta X para prosseguir com a comparação com a palavra
                if(x<frase.length()-1) {
                    x++;
                }
            }
            // Ao final da comparação da palavra com a frase, verifica se a repetição ocorreu, e se sim adiciona ao número de ocorrências
            if(valid) ocorrencias++;
            // Reverte o valor do X para antes da verificação da palavra, para que o laço da frase continue normalmente
            x = preX;
        }

        // Imprime as ocorrências encontradas
        System.out.println("O número de ocorrências da palavra '"+ palavra + "' na frase '"  + frase + "' é: " + ocorrencias);
    }
}
