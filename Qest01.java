//Contar caracteres de uma string Descrição: Peça ao usuário que digite uma palavra e mostre quantos caracteres ela possui (sem contar espaços). Exemplo de entrada: "Olá mundo" Saída esperada: 8 caracteres

import java.util.Scanner;

public class Qest01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        int letras, espaco = 0;
        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();
        
        
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
        
            if (Character.isWhitespace(c)) {      
                espaco++;
            }   
        }

        letras = frase.length() - espaco;
        System.out.println(letras);


        sc.close();



    }
}
