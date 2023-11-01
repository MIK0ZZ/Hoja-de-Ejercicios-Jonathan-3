import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase: ");
        String frase = sc.nextLine();
        sc.close();

        String frase_cambiada = frase.replace('e','x');

        System.out.println(frase_cambiada);
    }
}
