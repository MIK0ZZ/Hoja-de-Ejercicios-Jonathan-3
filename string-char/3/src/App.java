import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase y te cuento las vocales");
        String frase = sc.nextLine();
        sc.close();

        int contador = 0;
        int longitud = frase.length();
        String frasemin = frase.toLowerCase();
        int numero = 0;

//'a' || 'e' || 'i' || 'o' || 'u'

        for (int i=0 ; i < longitud ; i++) {
            char myChar = frasemin.charAt(numero);
            
            if ( myChar == ('a') || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u') {
                contador++;
            }
            numero++;
        } System.out.println(contador + " vocales");
    }
}
