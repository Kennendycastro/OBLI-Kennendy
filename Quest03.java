import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase= "";

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            System.out.println(c);

            
        }
        sc.close();
    }
}
