import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una frase: ");
        String frase = sc.nextLine();
        sc.close();

        int longitud = frase.length();
        int numero = 0;
        int cantidad = 0;
        
        

        for (int i = 0; i < longitud ; i++) {
            char miChar = frase.charAt(numero);
            numero++;
            if (miChar == 'a' || miChar == 'a') {
                cantidad++;
            }
        }
        System.out.println("Hay un total de " + cantidad + " 'a' en la frase");

        

        

        
        

    }

    
}
