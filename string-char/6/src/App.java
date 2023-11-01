import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una fase: ");
        String frase = sc.nextLine();
        String fraseT = frase.toLowerCase();
        System.out.print("Dime un caracter que remplazar: ");
        char c1 = sc.next().charAt(0);
        System.out.print("Dime ahora con que quieres remplazarlo: ");
        char c2 = sc.next().charAt(0);
        sc.close();

        String fraseN = fraseT.replace(c1, c2);

        System.out.println(fraseN);


    }
}
