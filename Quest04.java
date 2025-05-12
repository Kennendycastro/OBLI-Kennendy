import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.println(frase.replaceAll("[aeiou]", ""));
        scanner.close();
    }

}
