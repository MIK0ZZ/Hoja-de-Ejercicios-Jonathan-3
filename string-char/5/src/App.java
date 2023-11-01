import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra y te digo si es palindroma: ");
        String palabra = sc.nextLine();
        sc.close();

        String palabraT1 = palabra.toLowerCase();
        String palabraT2 = palabraT1.replace(' ', '\b');

        String palabra1 = "";
        String palabra2 = "";

        int longitud = palabraT2.length();
        
        int numero1 = palabraT2.length();
        int numero2 = 0;

        

        for (int i = palabra.length(); i > 0 ; i--) {

            char myChar1 = palabraT2.charAt(numero1-1);

            palabra1 += myChar1;
            numero1--;

            
        }

        for (int j = 0; j < longitud ; j++) {

            char myChar2 = palabraT2.charAt(numero2);

            palabra2 += myChar2;
            numero2++;

        }

        if (palabra1.equals(palabra2)) {
            System.out.println("Es palíndromo");
        } else {System.out.println("No es palíndromo");}

    }
}
