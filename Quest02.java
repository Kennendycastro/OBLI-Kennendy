import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String farse= "";

        System.out.println("Escreva uma frase: ");
        farse = sc.nextLine();
        System.out.println(farse.toUpperCase());
        System.out.println(farse.toLowerCase());
    }
}
