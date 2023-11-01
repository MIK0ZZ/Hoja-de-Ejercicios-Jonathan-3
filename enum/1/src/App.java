import java.util.Scanner;


/*
 * ADVERTENCIA: ESTO NI DE COÑA SE RESUELVE ASI PERO TENGO SUEÑO
 */

public class App {

    public enum DiaSemana {ERROR, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número y te digo el dia de la semana: ");
        int num = sc.nextInt();
        sc.close();

        DiaSemana Dia = DiaSemana.ERROR;

        switch (num) {
            case 1:
                Dia = DiaSemana.LUNES; 
                break;
            
            case 2:
                Dia = DiaSemana.MARTES; 
                break;
        
             
            case 3:
                Dia = DiaSemana.MIERCOLES; 
                break;
        
            
            case 4:
                Dia = DiaSemana.JUEVES; 
                break;
        
            case 5:
                Dia = DiaSemana.VIERNES; 
                break;
        
            case 6:
                Dia = DiaSemana.SABADO; 
                break;
        
            case 7:
                Dia = DiaSemana.DOMINGO; 
                break;
        
            
            default:
                break;
        }
        
        

        switch (Dia) {
            case LUNES:
                System.out.println("Es lunes");
                break;
            
            case MARTES:
                System.out.println("Es martes");
                break;

            case MIERCOLES:
                System.out.println("Es miércoles");
                break;
            
            case JUEVES:
                System.out.println("Es jueves");
                break;
            
            case VIERNES:
                System.out.println("Es viernes");
                break;
            
            case SABADO:
                System.out.println("Es sabado");
                break;
            
            case DOMINGO:
                System.out.println("Es domingo");
                break;
            
            default:
                break;
        }

    }
}
