import java.util.Scanner;

public class App {

    

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime 1 palabra: ");
        String palabra = sc.nextLine();
        sc.close();

        int cantidad = palabra.length();
        int longo = palabra.length();
        int numero = -1;
        

        for (int j=0; j < cantidad; j++) {
            numero++;
        }
        

        for (int i=0 ; i < longo ; i++) {
            char myChar = palabra.charAt(numero);
            System.out.print(myChar);
            
            numero--;
        } System.out.println();

    }

}
